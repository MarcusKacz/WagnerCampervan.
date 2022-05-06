import DAO.Campervan;
import DAO.CampervanDAO;
import javafx.application.Application;

import javax.swing.*;

import java.sql.SQLException;
import java.util.ArrayList;

import static javafx.application.Application.launch;

public class CheckCampervans {
    static JFrame checkCampervans;
    static  JScrollPane scrollPane;

    public static Class<? extends Application>campers(){

        checkCampervans = new JFrame("Check Campers");
        checkCampervans.setSize(1100,450);
        checkCampervans.setLayout(null);
        checkCampervans.setVisible(true);

        //Return button
        JButton menuReturn = new JButton("return");
        menuReturn.setBounds(50, 350, 120, 40);

        //Return to main menu
        menuReturn.addActionListener(e -> launch(GUImenu.mainMenu()));
        menuReturn.addActionListener(e -> {checkCampervans.setVisible(false);});

        checkCampervans.add(menuReturn);

        CampervanDAO campers = new CampervanDAO();
        Object[][] newCampers;
        try {
            ArrayList<Campervan> campersArray = campers.readCampervans();
            newCampers= new Object[campersArray.size()][10];

            for (int i = 0; i < campersArray.size(); i++) {
                newCampers[i][0] = campersArray.get(i).getCamperID();
                newCampers[i][1] = campersArray.get(i).getType();
                newCampers[i][2] = campersArray.get(i).getHeating();
                newCampers[i][3] = campersArray.get(i).getKitchen();
                newCampers[i][4] = campersArray.get(i).getDescription();
                newCampers[i][5] = campersArray.get(i).getTV();
                newCampers[i][6] = campersArray.get(i).getCurrentKM();
                newCampers[i][7] = campersArray.get(i).getLowSeasonPrice();
                newCampers[i][8] = campersArray.get(i).getHighSeasonPrice();
                newCampers[i][9] = campersArray.get(i).getNoOfBeds();

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
            //newCampers= new Object[1][10];
        }


// Creating the table
        JScrollPane scrollPane = new JScrollPane();
        String[] columnNames =
                {"Camper id", "type", "heating","kitchen","description","TV","Current KM", "Low Season Price", "High Season Price", "No Of Beds"};


        JTable table = new JTable(newCampers, columnNames);
        JScrollPane jScrollPane = new JScrollPane(table);

        jScrollPane.setBounds(50,50, 1000,300);
        checkCampervans.add(jScrollPane);








        return null;
    }


}
