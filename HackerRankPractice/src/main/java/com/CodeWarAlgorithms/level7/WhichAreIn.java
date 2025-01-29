package com.java.CodeWarAlgorithms.level7;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        Set<String> mySet = new TreeSet<>();
        int index = 0;
        for (String str1:array1) {
            boolean exist = Arrays.stream(array2).anyMatch(s -> s.contains(str1));
            if (exist) {
                mySet.add(str1);
            }
        }

        String[] result = new String[mySet.size()];
        for (String value:mySet) {
            result[index] = value;
            index++;
        }
        return result;

        /*
        return Arrays.stream(array1)
            .filter(str1 -> Arrays.stream(array2).anyMatch(s -> s.contains(str1)))
            .distinct() // Ensures uniqueness (TreeSet functionality)
            .sorted()   // Ensures sorted order (TreeSet functionality)
            .toArray(String[]::new);
         */
    }
}
