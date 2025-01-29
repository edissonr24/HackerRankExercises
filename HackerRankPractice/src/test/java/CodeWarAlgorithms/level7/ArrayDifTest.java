package com.java.CodeWarAlgorithms.level7;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDifTest {

    private ArrayDif arrayDif;


    @BeforeEach
    void setup() {
        arrayDif = new ArrayDif();
    }

    @Test
    void test1() {
        assertArrayEquals(new int[] {2}, arrayDif.arrayDiff(new int[]{1,2}, new int[]{1}));
        assertArrayEquals(new int[] {2,2}, arrayDif.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, arrayDif.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, arrayDif.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, arrayDif.arrayDiff(new int [] {}, new int[] {1,2}));
    }


}