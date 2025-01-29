package com.java.CodeWarAlgorithms.level7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NarcissisticNumberTest {

    private NarcissisticNumber narcissisticNumber;

    @BeforeEach
    void setup() {
        narcissisticNumber = new NarcissisticNumber();
    }

    @Test
    void test1() {
        assertTrue(narcissisticNumber.isNarcissistic(153), "153 is narcissistic");
        assertTrue(narcissisticNumber.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(narcissisticNumber.isNarcissistic(112), "112 is not narcissistic");
    }

}