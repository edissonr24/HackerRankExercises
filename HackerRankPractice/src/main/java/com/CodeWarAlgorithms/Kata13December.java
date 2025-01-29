package com.java.CodeWarAlgorithms;

import java.util.List;

/** The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.
 *  However, there is a bug in the method that needs to be resolved.
 */
public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = listOfNumbers.size()-1; i > 0; i--)
        {
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
            }
        }
        return listOfNumbers;
        //return listOfNumbers.stream().filter(n->n%2>0).toList();
    }
}
