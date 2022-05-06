package UnitTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    public Object instance;

    @Before
    public void setUp() {
        instance = new Object();
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
    public void test2 (){


    }

}
