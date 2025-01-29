package com.java.CodeWarAlgorithms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class GrassHopper {

    /** To find the mean (average) of a set of numbers add all of the numbers together and divide by the number of values in the list.
     *  For an example list of 1, 3, 5, 7
     *  Solution: 4
     */
    public static int findAverage(int[] nums) {

        //List<Integer> myList = Arrays.asList(1,2,3,4,5);
        //List<Integer> myList = List.of(1,2,3,4,5);
        //List<Integer> myList = Arrays.stream(nums).boxed().toList();
        //OptionalDouble edi = myList.stream().mapToInt(Integer::intValue).average();

        return (int)Arrays.stream(nums).average().orElse(0);
    }

}
