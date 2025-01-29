package com.java.CodeWarAlgorithms;


public class NumberFun {
    public static long findNextSquare(long sq) {

        int origin = (int)Math.sqrt(sq);
        if (Math.pow(origin, 2) == sq) {
            return (long) Math.pow(origin+1, 2);
        }
        return -1;
    }
}
