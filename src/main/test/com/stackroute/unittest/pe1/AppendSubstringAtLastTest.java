package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppendSubstringAtLastTest {

    AppendSubstringAtLast appendSubstringAtLast;
    @Before
    public void setUp() throws Exception {
        appendSubstringAtLast=new AppendSubstringAtLast();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateatlast() {
        assertEquals("Stackroutetete",appendSubstringAtLast.generateatlast(2,"Stackroute"));
    }
}