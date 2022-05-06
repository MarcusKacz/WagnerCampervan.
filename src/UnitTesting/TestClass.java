package UnitTesting;

import DAO.Campervan;
import DAO.CampervanDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestClass {
    public CampervanDAO campervanInstance;

    @Before
    public void setUp() {
        campervanInstance = new CampervanDAO();
    }

    @After
    public void stop(){
        campervanInstance = null;
    }

    @Test
    public void test1 (){
        int expected = 30;
        int calcValue1 = 3;
        int calcValue2 = 8;
        System.out.println("testing compute... using parameters a="+ calcValue1 +" and b="+ calcValue2 +" must return "+ expected);
        //TODO int actual = instance.(calcValue1,calcValue2);
        //assertEquals(expected,actual);
    }

    @Test
    public void test2 () throws SQLException {
        ArrayList vans = campervanInstance.readCampervans();

        for (int i = 0; i < vans.size(); i++) {
            Campervan van = (Campervan) vans.get(i);

            System.out.println(van.getCamperID() + van.getDescription() + van.getTV());
        }

    }

}
