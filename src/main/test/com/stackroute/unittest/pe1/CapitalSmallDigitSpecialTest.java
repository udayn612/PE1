package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalSmallDigitSpecialTest {

    CapitalSmallDigitSpecial capitalSmallDigitSpecial;
    @Before
    public void setUp() throws Exception {
        capitalSmallDigitSpecial=new CapitalSmallDigitSpecial();
    }

    @After
    public void tearDown() throws Exception {
        capitalSmallDigitSpecial=null;
    }

    @Test
    public void checkuppercase () {
        assertEquals("Capital letter",capitalSmallDigitSpecial.check('A'));
    }

    @Test
    public void checklowercase() {
        assertEquals("Lower case letter",capitalSmallDigitSpecial.check('a'));
    }

    @Test
    public void checkdigit() {
        assertEquals("Digit",capitalSmallDigitSpecial.check('1'));
    }

    @Test
    public void checkspecialcharacter() {
        assertEquals("Special Character",capitalSmallDigitSpecial.check('@'));
    }
}