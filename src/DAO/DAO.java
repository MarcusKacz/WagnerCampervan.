package DAO;

import java.util.List;
import java.util.Optional;

public interface DAO<Reservation>{

    Optional<Reservation> get(long id);

    List<Reservation> getAll();

    void save(Reservation t);

    void update(Reservation t, String[] params);

    void delete(Reservation t);


}
