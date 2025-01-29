package com.java.CodeWarAlgorithms;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopperTest {

    private GrassHopper grassHopper;

    @Before
    public void setup() {
        grassHopper = new GrassHopper();
    }

    @Test
    public void test1() {
        assertEquals(1, GrassHopper.findAverage(new int[]{1}));
    }
    @Test
    public void test2() {
        assertEquals(4, GrassHopper.findAverage(new int[]{1,3,5,7}));
    }

}