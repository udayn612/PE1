package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ques6Test {

    Ques6 qs;
    @Before
    public void setUp() throws Exception {
        qs=new Ques6();
    }

    @After
    public void tearDown() throws Exception {
        qs=null;
    }

    @Test
    public void checkuppercase () {
        assertEquals("Capital letter",qs.check('A'));
    }

    @Test
    public void checklowercase() {
        assertEquals("Lower case letter",qs.check('a'));
    }

    @Test
    public void checkdigit() {
        assertEquals("Digit",qs.check('1'));
    }

    @Test
    public void checkspecialcharacter() {
        assertEquals("Special Character",qs.check('@'));
    }
}