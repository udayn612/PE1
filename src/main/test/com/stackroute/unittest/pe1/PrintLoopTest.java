package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintLoopTest {

    PrintLoop qs;
    @Before
    public void setUp() throws Exception {
        qs=new PrintLoop();
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