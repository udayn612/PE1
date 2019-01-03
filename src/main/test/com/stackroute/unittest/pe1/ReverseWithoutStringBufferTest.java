package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWithoutStringBufferTest {

    ReverseWithoutStringBuffer q9;
    @Before
    public void setUp() throws Exception {

         q9=new ReverseWithoutStringBuffer();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reversestring() {

        assertEquals("cba",q9.reversestring("abc"));
    }
}