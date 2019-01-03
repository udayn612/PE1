package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class Ques8Test {

    Ques8 q8;
    private static final String Inp="23 44 34";
    ByteArrayInputStream input=new ByteArrayInputStream(Inp.getBytes());
    @Before
    public void setUp() throws Exception {
        q8=new Ques8();
        System.setIn(input);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void func() {

        assertEquals(true,q8.func(34));
    }
}