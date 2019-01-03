package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonentCheckTest {

    VowelConsonentCheck vowelConsonentCheck_obj;
    @Before
    public void setUp() throws Exception {
        vowelConsonentCheck_obj =new VowelConsonentCheck();
    }

    @After
    public void tearDown() throws Exception {
        vowelConsonentCheck_obj =null;
    }

    @Test
    public void isvowelconsonent() {
        assertEquals(true, vowelConsonentCheck_obj.isvowelconsonent("a"));
    }

    @Test
    public void ischaracter() {
        assertEquals(true, vowelConsonentCheck_obj.ischaracter("p"));
    }
}