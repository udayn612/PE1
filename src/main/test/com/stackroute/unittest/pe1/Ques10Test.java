package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ques10Test {

    Ques10 q10;
    @Before
    public void setUp() throws Exception {
        q10=new Ques10();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateatlast() {
        assertEquals("Stackroutetete",q10.generateatlast(2,"Stackroute"));
    }
}