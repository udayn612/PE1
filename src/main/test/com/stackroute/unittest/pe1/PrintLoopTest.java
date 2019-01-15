package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintLoopTest {

    PrintLoop printLoop;
    @Before
    public void setUp() throws Exception {
        printLoop=new PrintLoop();
    }

    @After
    public void tearDown() throws Exception {
        printLoop=null;
    }

    @Test
    public void generatenumbers() {

        assertEquals("122333",printLoop.generatenumbers(3));
    }
}