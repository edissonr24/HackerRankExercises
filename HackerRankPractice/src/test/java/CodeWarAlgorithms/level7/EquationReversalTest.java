package com.java.CodeWarAlgorithms.level7;

import org.junit.Test;

import static org.junit.Assert.*;

public class EquationReversalTest {

    @Test
    public void basicTests(){
        assertEquals("y/b*100", EquationReversal.solve("100*b/y"));
        assertEquals("30*d/c-b+a", EquationReversal.solve("a+b-c/d*30"));
        assertEquals("50+c/b*a", EquationReversal.solve("a*b/c+50"));
    }
}