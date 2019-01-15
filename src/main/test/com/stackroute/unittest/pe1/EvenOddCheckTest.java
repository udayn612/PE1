package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddCheckTest {

    EvenOddCheck evenOddCheck=new EvenOddCheck();
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
        assertEquals("Tom",evenOddCheck.isoddeven(21));

    }

    @Test
    public void check() {
        assertEquals("Jerry",evenOddCheck.isoddeven(22));

    }


}