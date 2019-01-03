package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class Ques4Test {

    Ques4 qs;
    @Before
    public void setUp() throws Exception {
        qs=new Ques4();
    }

    @After
    public void tearDown() throws Exception {
        qs=null;
    }

    @Test
    public void generatenumbers() {

        assertEquals("122333",qs.generatenumbers(3));
    }
}