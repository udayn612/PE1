package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumbersTest {

    SortNumbers sortNumbers;
    @Before
    public void setUp() throws Exception {
        sortNumbers=new SortNumbers();
    }

    @After
    public void tearDown() throws Exception {
        sortNumbers=null;
    }



    @Test
    public void sortnumbers() {
        assertEquals("544332",sortNumbers.sortnumbers(234534));
    }

    @Test
    public void add() {
        assertEquals(10,sortNumbers.add(234534));
    }

    @Test
    public void check() {
        assertEquals(false,sortNumbers.check(234534));
    }
}