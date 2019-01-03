package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ques3Test {

    Ques3 ques3_obj;
    @Before
    public void setUp() throws Exception {
        ques3_obj=new Ques3();
    }

    @After
    public void tearDown() throws Exception {
        ques3_obj=null;
    }

    @Test
    public void isvowelconsonent() {
        assertEquals(true,ques3_obj.isvowelconsonent("a"));
    }

    @Test
    public void ischaracter() {
        assertEquals(true,ques3_obj.ischaracter("p"));
    }
}