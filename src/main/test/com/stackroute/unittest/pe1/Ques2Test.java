package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ques2Test {

    Ques2 qs=new Ques2();
    @Before
    public void setUp() throws Exception {

        System.out.println("Inside Setup");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Inside tearDown");
    }

    @Test
    public void main() {
    }

    @Test
    public void isoddeven() {
        assertEquals("Tom",qs.isoddeven(21));

    }

    @Test
    public void check() {
        assertEquals("Jerry",qs.isoddeven(22));

    }


}