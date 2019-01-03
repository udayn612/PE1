package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ques5Test {

    Ques5 qs;
    @Before
    public void setUp() throws Exception {
        qs=new Ques5();
    }

    @After
    public void tearDown() throws Exception {
        qs=null;
    }

    @Test
    public void sum() {
        assertEquals(41,qs.sum("12 23 2 4"));
    }
}