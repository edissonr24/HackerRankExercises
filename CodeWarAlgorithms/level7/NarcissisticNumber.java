package com.java.CodeWarAlgorithms.level7;

public class NarcissisticNumber {

    public boolean isNarcissistic(int number) {

        char[] numberString = String.valueOf(number).toCharArray();

        int total = 0;
        for(Character c: numberString) {
            total += (int) Math.pow(Character.getNumericValue(c), numberString.length);
        }
        return total == number;
    }
}
