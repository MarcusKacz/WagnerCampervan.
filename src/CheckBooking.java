import javafx.application.Application;
//import sun.jvm.hotspot.types.JByteField;

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
        menuReturn.setBounds(50, 500, 120, 40);

        //Return to main menu
        menuReturn.addActionListener(e -> launch(GUImenu.mainMenu()));
        menuReturn.addActionListener(e -> {checkBooking.setVisible(false);});

        checkBooking.add(menuReturn);

// Creating the table
        JScrollPane scrollPane = new JScrollPane();

        String[] columnNames =
                {"Costumer ID", "Costumer Name", "Week nr of depature", "nr of weeks", "Campervan type"};

        Object[][] data =
                {
                        {new Integer(1),"Allan", new Integer(21), new Integer(3),"Luxury"},
                        {new Integer(2),"Marcus", new Integer(22), new Integer(4), "Basic"}
                };


        JTable table = new JTable(data, columnNames);
        JScrollPane jScrollPane = new JScrollPane(table);

        jScrollPane.setBounds(205,100, 700,300);
        checkBooking.add(jScrollPane);


        JButton addNewBooking = new JButton("New Booking");
        addNewBooking.setBounds(50, 100, 120, 40);
        checkBooking.add(addNewBooking);

        JButton editBooking = new JButton("Edit Booking");
        editBooking.setBounds(50, 150, 120, 40);
        checkBooking.add(editBooking);

        JButton deleteBooking = new JButton("Delete Booking");
        deleteBooking.setBounds(50, 200, 120, 40);
        checkBooking.add(deleteBooking);

        JButton confirm = new JButton("Confirm");
        confirm.setBounds(850, 500, 120, 40);
        checkBooking.add(confirm);







        return null;
    }

}
