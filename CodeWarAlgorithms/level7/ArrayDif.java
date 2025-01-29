package com.java.CodeWarAlgorithms.level7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDif {

    public int[] arrayDiff(int[] a, int[] b) {


        return Arrays.stream(a)
                .filter(x -> Arrays.stream(b).noneMatch(y-> y == x))
                .toArray();
    }
}
