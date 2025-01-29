package com.java.CodeWarAlgorithms.level7;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class YourOrder {

    /**Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

     Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

     If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
     */
    public static String order(String words) {
        // ...
        String [] wordsArray = words.split(" {1}");
        String [] orderedArray = new String[wordsArray.length];
        System.out.println("words: " + words);

        if (!words.isBlank()) {
            for (String w : wordsArray) {
                Optional<Character> existAny = w.chars()
                        .mapToObj(c -> (char) c)
                        .filter(Character::isDigit)
                        .findAny();

                System.out.println("Exist: " + existAny.get());
                /*if (existAny.isPresent()) {
                    orderedArray[Character.getNumericValue(existAny.get())] = w;
                }*/
                existAny.ifPresent(character -> orderedArray[Character.getNumericValue(character)-1] = w);
                //return Arrays.stream(orderedArray).collect(Collectors.joining(" "));
            }
        }
        //return String.join(" ", orderedArray);
        return Arrays.stream(orderedArray)
                .filter(Objects::nonNull) // Remove null elements
                .collect(Collectors.joining(" "));

    }

    // Code refactor
    public static String orderRF(String words) {
        if (words.isBlank()) {
            return "";
        }

        String[] wordsArray = words.split("\\s+"); // Split by one or more spaces
        String[] orderedArray = new String[wordsArray.length];

        Arrays.stream(wordsArray).forEach(word ->
                word.chars()
                        .mapToObj(c -> (char) c)
                        .filter(Character::isDigit)
                        .findFirst()
                        .ifPresent(character ->
                                orderedArray[Character.getNumericValue(character) - 1] = word
                        )
        );

        return Arrays.stream(orderedArray)
                .filter(Objects::nonNull) // Remove null elements
                .collect(Collectors.joining(" "));
    }
}
