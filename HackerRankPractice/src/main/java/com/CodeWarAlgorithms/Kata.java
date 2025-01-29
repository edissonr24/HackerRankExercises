package com.java.CodeWarAlgorithms;

public class Kata {

    public static String getMiddle(String word) {
        //Code goes here!
        int middleValue = word.length()/2;
        if (word.length()%2 == 0) {
            return word.substring(middleValue-1, middleValue+1);
        }
        return word.substring(middleValue, middleValue+1);
    }
}
