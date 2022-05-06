package DAO;

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


    @Override
    public Optional<Reservation> get(long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Reservation r) {
        db.customString("DELETE FROM Reservation WHERE ReservationID = "+ r.getReservationID());
    }

}
