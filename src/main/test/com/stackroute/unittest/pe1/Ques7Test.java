package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ques7Test {

    Ques7 qs;
    @Before
    public void setUp() throws Exception {
        qs=new Ques7();
    }

    @After
    public void tearDown() throws Exception {
        qs=null;
    }



    @Test
    public void sortnumbers() {
        assertEquals("544332",qs.sortnumbers(234534));
    }

    @Test
    public void add() {
        assertEquals(10,qs.add(234534));
    }

    @Test
    public void check() {
        assertEquals(false,qs.check(234534));
    }
}