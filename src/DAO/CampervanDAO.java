package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CampervanDAO {

    public ArrayList readCampervans() throws SQLException {
        ArrayList<Campervan> vans = new ArrayList<>();

        Database db = new Database();
        db.connect();

        ResultSet rs = db.getData("SELECT * FROM Campervan");

        while (rs.next()) {
            int camperID = rs.getInt("CamperID");
            String type = rs.getString("Type");
            int currentKM = rs.getInt("currentKM");
            int lowSeasonPrice = rs.getInt("lowSeasonPrice");
            int highSeasonPrice = rs.getInt("highSeasonPrice");
            String heating = rs.getString("heating");
            int noOfBeds = rs.getInt("noOfBeds");
            String kitchen = rs.getString("kitchen");
            boolean tv = rs.getBoolean("TV");
            String description = rs.getString("Description");

            Campervan campervan = new Campervan(camperID,currentKM,lowSeasonPrice,highSeasonPrice,noOfBeds,type,heating,kitchen,description,tv);

            vans.add(campervan);
        }
        db.disconnect();

        return vans;
    }
}
