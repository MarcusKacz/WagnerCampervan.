import javafx.application.Application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javafx.application.Application.launch;


public class GUImenu extends Main implements ActionListener {

    static JFrame frontPanel;

    public static Class<? extends Application> mainMenu(){


        frontPanel =new JFrame("Wagner");
        JButton menuButton=new JButton("Create Booking");
        menuButton.setBounds(150,100,200,30);

        JButton bookingsButton = new JButton("Bookings");
        bookingsButton.setBounds(150, 150, 200, 30);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(150,700,200,30);

        JButton checkCamper = new JButton("Check Campers");
        checkCamper.setBounds(150,200,200,30);
        //Open campers
        checkCamper.addActionListener(e -> launch(CheckCampervans.campers()));
        checkCamper.addActionListener(e -> {frontPanel.setVisible(false);});

        // To open Create Bookings
        menuButton.addActionListener(e -> launch(CreateBooking.jframeMenu()));
        menuButton.addActionListener(e -> {frontPanel.setVisible(false);});

        // To open Bookings
        bookingsButton.addActionListener(e -> launch(CheckBooking.bookings()));
        bookingsButton.addActionListener(e -> {frontPanel.setVisible(false);});


        closeButton.addActionListener(e -> launch(CloseProgram.closeProgramJFrame()));





        frontPanel.add(menuButton);
        frontPanel.add(bookingsButton);
        frontPanel.add(closeButton);
        frontPanel.add(checkCamper);


        frontPanel.setSize(500,1000);
        frontPanel.setLayout(null);
        frontPanel.setVisible(true);



    return null;

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
