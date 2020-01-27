package com.example.testing;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MyTest {

    Arithematic arithematic=null;

    @Before
    public void testAddition(){

        float expectedResult=10;
        float actualResult=arithematic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubtract(){
        Arithematic arithematic=new Arithematic();
        float expectedResult=5;
        float actualResult=arithematic.subtract(15,10);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivide(){
        Arithematic arithematic=new Arithematic();
        float expectedResult=5;
        float actualResult=arithematic.divide(25,5);
        assertEquals(expectedResult,actualResult);
    }
}
