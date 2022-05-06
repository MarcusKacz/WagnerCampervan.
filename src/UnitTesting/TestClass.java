package UnitTesting;

import DAO.Campervan;
import DAO.CampervanDAO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class TestClass {
    public CampervanDAO instance;

    @Before
    public void setUp() {
        instance = new CampervanDAO();
    }

    @After
    public void stop(){
        instance = null;
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
        instance.readCampervans();

    }

}
