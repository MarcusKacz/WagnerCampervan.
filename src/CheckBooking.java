import javafx.application.Application;

import javax.swing.*;

import static javafx.application.Application.launch;

public class CheckBooking {

    static JFrame checkBooking;

    public static Class<? extends Application>bookings(){

        checkBooking = new JFrame("Check Booking");
        checkBooking.setSize(1000,600);
        checkBooking.setLayout(null);
        checkBooking.setVisible(true);

        //Return button
        JButton menuReturn = new JButton("return");
        menuReturn.setBounds(400, 535, 200, 30);

        //Return to main menu
        menuReturn.addActionListener(e -> launch(GUImenu.mainMenu()));
        menuReturn.addActionListener(e -> {checkBooking.setVisible(false);});

        checkBooking.add(menuReturn);

        return null;
    }

}
