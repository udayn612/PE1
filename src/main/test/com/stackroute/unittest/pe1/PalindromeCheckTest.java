package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {

    PalindromeCheck palindromeCheck_obj;

    @Before
    public void setUp() throws Exception {
         palindromeCheck_obj =new PalindromeCheck();
         System.out.println("Inside Setup");
    }

    @After
    public void tearDown() throws Exception {
         palindromeCheck_obj =null;
        System.out.println("Inside teardown");
    }

    @Test
    public void palindrome() {


        assertEquals(true, palindromeCheck_obj.palindrome(121));
    }

    @Test
    public void evenNumberSum() {
        assertEquals(2, palindromeCheck_obj.evenNumberSum(121));
    }

}