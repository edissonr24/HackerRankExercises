package com.java.CodeWarAlgorithms;

import java.util.Arrays;
import java.util.List;

public class DRoot {
    /*public static int digital_root2(int n) {
        // ...
        String value = String.valueOf(n);
        int sum = 0;

        while(value.length() > 1) {
            sum = 0;
            for (Character c: value.toCharArray()){
                //sum += Integer.parseInt(String.valueOf(c));
                sum += Character.getNumericValue(c);
            }
            value = String.valueOf(sum);

        }
        return sum;
    }*/

    /** Sum the digits of a number while it is greater than 1 digit */
    public static int digital_root(int n) {
        while(n >= 10) {
            n = String.valueOf(n)
                    .chars()
                    //.map(x -> Character.getNumericValue(x))
                    .map(Character::getNumericValue)
                    .sum();

        }
        return n;
    }

}
