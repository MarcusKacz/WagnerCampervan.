package DAO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReservationDAO implements DAO<Reservation>{

    private List<Reservation> reservations = new ArrayList<>();
    public Database db = new Database();


    public void insertReservation (Reservation r){
        db.connect();
        db.customString("EXEC insertReservation "+ r.getWeek() +", "+ r.getCamperID() +", "+ r.getCustomerID() +", "+ r.getInsuranceID() +", "+ r.isDepositPaid());
        db.disconnect();
    }

    public ArrayList readReservations() throws SQLException {
        ArrayList<Reservation> reservations = new ArrayList<>();

        db.connect();

        ResultSet rs = db.getData("SELECT * FROM Reservation");

        while (rs.next()) {
            int reservationID = rs.getInt("ReservationID");
            int week = rs.getInt("Week");
            int camperID = rs.getInt("CamperID");
            int customerID = rs.getInt("CustomerID");
            int insuranceID = rs.getInt("InsuranceID");
            int drivenKM = rs.getInt("drivenKM");
            boolean depositPaid = rs.getBoolean("DepositPaid");
            Date reservationDate = rs.getDate("ReservationDate");


            Reservation res = new Reservation(week,camperID,customerID,insuranceID,drivenKM,depositPaid);

            reservations.add(res);
        }
        db.disconnect();

        return reservations;
    }


    @Override
    public Optional<Reservation> get(long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Reservation r) {
        db.connect();
        db.customString("DELETE FROM Reservation WHERE ReservationID = "+ r.getReservationID());
        db.disconnect();
    }

}
