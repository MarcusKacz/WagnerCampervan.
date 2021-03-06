import DAO.Reservation;
import DAO.ReservationDAO;
import javafx.application.Application;

import javax.swing.*;

import static javafx.application.Application.launch;

public class CreateBooking extends CheckBooking{

    static JFrame menuPanel;
    static JButton bookingDone;
    static JTextField cID;
    static JTextField CName;
    static JTextField cEnterWeekNr;
    static JTextField cNumberOfWeeks;
    static JLabel optionsToChoose;

    int CostumerID;
    String FullName;
    int WeekNumberDeparture;
    int NumberOfWeeks;
    String CampervanType;

    Reservation res;


    public void TypeReservation(){

        if(bookingDone.isSelected()){

            cID.setText(String.valueOf(CostumerID));
            CName.setText(String.valueOf(FullName));
            cEnterWeekNr.setText(String.valueOf(WeekNumberDeparture));
            cNumberOfWeeks.setText(String.valueOf(NumberOfWeeks));
            optionsToChoose.setText(String.valueOf(CampervanType));

            for (int i = 0; i < NumberOfWeeks; i++) {
                Reservation reservation = new Reservation(WeekNumberDeparture + i,1,CostumerID,1,0,false);

                ReservationDAO reservationDAO = new ReservationDAO();
                reservationDAO.insertReservation(reservation);
            }

        }

    }


    public static Class<? extends Application> jframeMenu() {

        menuPanel = new JFrame("Booking");
        JButton menuReturn = new JButton("return");
       menuReturn.setBounds(50, 535, 200, 30);

        JTextField cID,CName, cEnterWeekNr, cNumberOfWeeks;

        JLabel enterCID = new JLabel("Enter Costumer ID: ");
        enterCID.setBounds(50,100,300,30);
        menuPanel.add(enterCID);
        cID = new JTextField("");
        cID.setBounds(205,100, 300,30);

        JLabel enterCName = new JLabel("Enter name: ");
        enterCName.setBounds(50,150,300,30);
        menuPanel.add(enterCName);
        CName = new JTextField("");
        CName.setBounds(205,150, 300,30);

        JLabel enterWeekNumber = new JLabel("Week nr of departure: ");
        enterWeekNumber.setBounds(50,200,300,30);
        menuPanel.add(enterWeekNumber);
        cEnterWeekNr = new JTextField("");
        cEnterWeekNr.setBounds(205,200, 300,30);

        JLabel numberOfWeeks = new JLabel("Enter number of weeks: ");
        numberOfWeeks.setBounds(50,250,300,30);
        menuPanel.add(numberOfWeeks);
        cNumberOfWeeks = new JTextField("");
        cNumberOfWeeks.setBounds(205,250, 300,30);


        JLabel chooseCampervan = new JLabel("Choose campervan type: ");
        chooseCampervan.setBounds(50,300, 300,30);
        menuPanel.add(chooseCampervan);
        String[] optionsToChoose = {"Luxury", "Standard", "Basic"};
        JComboBox<String> camperVan = new JComboBox<>(optionsToChoose);
        camperVan.setBounds(205, 300, 300, 30);
        menuPanel.add(camperVan);



        JButton bookingDone = new JButton("Confirm Booking");
        bookingDone.setBounds(400, 535, 200, 30);
        menuPanel.add(bookingDone);






     menuPanel.add(cID); menuPanel.add(CName); menuPanel.add(cEnterWeekNr); menuPanel.add(cNumberOfWeeks);
        menuPanel.setSize(400,400);
        menuPanel.setLayout(null);
        menuPanel.setVisible(true);

        menuPanel.add(menuReturn);


        menuPanel.setSize(650, 650);
        menuPanel.setLayout(null);
        menuPanel.setVisible(true);

        // To return to main menu
        menuReturn.addActionListener(e -> launch(GUImenu.mainMenu()));
        menuReturn.addActionListener(e -> {menuPanel.setVisible(false);});

        return null;

    }






}


