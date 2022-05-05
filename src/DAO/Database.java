package DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;


public class Database{

    private static Connection con;
    private static String url;
    private static String port;
    private static String databaseName;
    private static String userName;
    private static String password;

    private boolean terminated = false;

    public Database() { }

    public void handleDBProperties() {

        Properties props = new Properties();
        String fileName = "db.properties";
        InputStream input;
        try {
            input = new FileInputStream(fileName);
            props.load(input);
            url = props.getProperty("url", "localhost");
            port = props.getProperty("port","1433");
            databaseName = props.getProperty("databaseName");
            userName=props.getProperty("userName", "sa");
            password=props.getProperty("password");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(ClassNotFoundException | IOException e){
            System.err.println(e.getMessage());
        }
    }

    public void connect(){
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://"+url+":"+port+";databaseName="+databaseName,userName,password);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void disconnect(){
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void addTo(String tableName, String project_no, String project_name, int budget) {

        try{
            // Prepare Statement
            PreparedStatement ps = con.prepareStatement("INSERT INTO " + tableName + " VALUES (?,?,?)");

            // Add values to placeholders
            ps.setString(1, project_no);
            ps.setString(2, project_name);
            ps.setDouble(3, budget);

            // Execute
            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Row added!");
    }

    public void addTo(String tableName, int emp_no, String emp_fname, String emp_lname, String dept_no) {

        try{
            // Prepare Statement
            PreparedStatement ps = con.prepareStatement("INSERT INTO " + tableName + " VALUES (?,?,?,?)");

            // Add values to placeholders
            ps.setInt(1, emp_no);
            ps.setString(2, emp_fname);
            ps.setString(3, emp_lname);
            ps.setString(4, dept_no);

            // Execute
            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Row added!");
    }

    public void updateField(String tableName, String fieldToChange, String oldEntry, String newEntry) {

        try{
            // Prepare Statement
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE " + tableName + " SET " + fieldToChange + " = (?) WHERE " + fieldToChange + " = (?) ");

            // Add values to placeholders
            ps.setString(1, newEntry);
            ps.setString(2, oldEntry);

            // Execute
            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Field updated");
    }

    public void deleteFrom(String tableName, String fieldName, String value) {

        try{
            // Prepare Statement
            PreparedStatement ps = con.prepareStatement("DELETE FROM " + tableName + " WHERE " + fieldName + " = (?)");

            // Add values to placeholders
            ps.setString(1, value);

            // Execute
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Row deleted!");
    }

    public void customString(String sqlQuery) {

        try{
            // Prepare Statement
            PreparedStatement ps = con.prepareStatement(sqlQuery);

            // Execute
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("done");
    }

    public String getDisplayData(){
        if (terminated){
            System.exit(0);
        }
        if (!pendingData){
            terminated=true;
            throw new RuntimeException("ERROR! No previous select, communication with the database is lost!");
        }else if (!moreData){
            disconnect();
            pendingData=false;
            return NOMOREDATA;
        }else {
            return getNextValue(true);
        }
    }
}

