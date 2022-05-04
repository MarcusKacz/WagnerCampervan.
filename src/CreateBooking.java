import javafx.application.Application;

import javax.swing.*;

import static javafx.application.Application.launch;

public class CreateBooking {

    static JFrame menuPanel;

    public static Class<? extends Application> jframeMenu() {

        menuPanel = new JFrame("Booking");
        JButton menuReturn = new JButton("return");
        menuReturn.setBounds(400, 535, 200, 30);

        JTextField cID,CName, cEnterWeekNr, cNumberOfWeeks;

        cID = new JTextField("Enter costumer ID");
        cID.setBounds(50,100, 300,30);

        CName = new JTextField("Enter Name");
        CName.setBounds(50,150, 300,30);

        cEnterWeekNr = new JTextField("Week nr of departure");
        cEnterWeekNr.setBounds(50,200, 300,30);

        cNumberOfWeeks = new JTextField("Enter number of weeks");
        cNumberOfWeeks.setBounds(50,250, 300,30);

        String[] optionsToChoose = {"Choose campervan type","Luxury", "Standard", "Basic"};

        JComboBox<String> camperVan = new JComboBox<>(optionsToChoose);
        camperVan.setBounds(50, 300, 300, 30);

        menuPanel.add(camperVan);

        JButton bookingDone = new JButton("Confirm Booking");
        bookingDone.setBounds(50, 535, 200, 30);
        menuPanel.add(bookingDone);




        menuPanel.add(cID); menuPanel.add(CName); menuPanel.add(cEnterWeekNr); menuPanel.add(cNumberOfWeeks);
        menuPanel.setSize(400,400);
        menuPanel.setLayout(null);
        menuPanel.setVisible(true);

        menuPanel.add(menuReturn);


        menuPanel.setSize(600, 600);
        menuPanel.setLayout(null);
        menuPanel.setVisible(true);

        // To return to main menu
        menuReturn.addActionListener(e -> launch(GUImenu.mainMenu()));
        menuReturn.addActionListener(e -> {menuPanel.setVisible(false);});

        return null;

    }

}


