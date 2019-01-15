package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumbersTest {

    SumOfNumbers sumOfNumbers;
    @Before
    public void setUp() throws Exception {
        sumOfNumbers=new SumOfNumbers();
    }

    @After
    public void tearDown() throws Exception {
        sumOfNumbers=null;
    }

    @Test
    public void sum() {
        assertEquals(41,sumOfNumbers.sum("12 23 2 4"));
    }
}