package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.font.TrueTypeFont;

import static org.junit.Assert.*;

public class Ques1Test {

    Ques1 ques1_obj;

    @Before
    public void setUp() throws Exception {
         ques1_obj=new Ques1();
         System.out.println("Inside Setup");
    }

    @After
    public void tearDown() throws Exception {
         ques1_obj=null;
        System.out.println("Inside teardown");
    }

    @Test
    public void palindrome() {


        assertEquals(true,ques1_obj.palindrome(121));
    }

    @Test
    public void evenNumberSum() {
        assertEquals(2,ques1_obj.evenNumberSum(121));
    }

}