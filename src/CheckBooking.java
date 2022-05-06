import DAO.Campervan;
import DAO.CampervanDAO;
import DAO.Reservation;
import DAO.ReservationDAO;
import javafx.application.Application;
//import sun.jvm.hotspot.types.JByteField;

import javax.swing.*;

import java.sql.SQLException;
import java.util.ArrayList;

import static javafx.application.Application.launch;

public class CheckBooking {

    static JFrame checkBooking;
    static  JScrollPane scrollPane;

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
                {"Week", "Camper id", "Customer id ", "Insurance id","Driven KM","is Deposit paid","Reservation date"};
        ReservationDAO reservations = new ReservationDAO();
        Object[][] newReservations;
        try {
            ArrayList<Reservation> reservationsArray = reservations.readReservations();
            newReservations= new Object[reservationsArray.size()][7];

            for (int i = 0; i < reservationsArray.size(); i++) {
                //newReservations[i][0] = reservationsArray.get(i).getReservationID();
                newReservations[i][0] = reservationsArray.get(i).getWeek();
                newReservations[i][1] = reservationsArray.get(i).getCamperID();
                newReservations[i][2] = reservationsArray.get(i).getCustomerID();
                newReservations[i][3] = reservationsArray.get(i).getInsuranceID();
                newReservations[i][4] = reservationsArray.get(i).getDrivenKM();
                newReservations[i][5] = reservationsArray.get(i).isDepositPaid();
                newReservations[i][6] = reservationsArray.get(i).getReservationDate();

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
            //newCampers= new Object[1][10];
        }


        JTable table = new JTable(newReservations, columnNames);
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
