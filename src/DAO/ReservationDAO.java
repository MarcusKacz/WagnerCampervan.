package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReservationDAO implements DAO<Reservation>{

    private List<Reservation> reservations = new ArrayList<>();






    @Override
    public Optional<Reservation> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Reservation> getAll() {
        return null;
    }

    @Override
    public void delete(Reservation t) {

    }

    @Override
    public void update(Reservation t, String[] params) {

    }

    @Override
    public void save(Reservation t) {

    }
}
