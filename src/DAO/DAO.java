package DAO;

import java.util.List;
import java.util.Optional;

public interface DAO<Reservation>{

    Optional<Reservation> get(long id);


    void delete(Reservation r);


}
