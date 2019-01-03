package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ques9Test {

    Ques9 q9;
    @Before
    public void setUp() throws Exception {

         q9=new Ques9();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reversestring() {

        assertEquals("cba",q9.reversestring("abc"));
    }
}