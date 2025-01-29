package com.java.CodeWarAlgorithms.level7;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class CountCharacters {
    public static Map<Character, Integer> count2(String str) {
        // Happy coding!
        Map<Character, Integer> countingMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        //List<Character> charList = str.chars().mapToObj(c -> (char) c).distinct().toList();
        Set<Character> charSet = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        for(Character c : charSet) {
            countingMap.put(c, countCharacters(str, c));
        }


        return countingMap;
    }

    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> countingMap = new HashMap<>();
        for(char c : str.toCharArray()) {
            int actual = countingMap.getOrDefault(c, 0);
            countingMap.put(c, actual + 1);
        }
        return countingMap;
    }

    private static int countCharacters(String str, Character ch) {
        return (int)str.chars().filter(c -> c == ch).count();
    }


    // Decode exercise
    /*public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        StringBuilder text = new StringBuilder();
        String[] splitWords = morseCode.split(" {3}");
        for(String c : splitWords) {
            System.out.println("Word: " + c);

            String[] splitLetters = c.split(" {1}");
            for (String code : splitLetters) {
                System.out.println("Letter: " + MorseCode.get(code));
                text.append(MorseCode.get(code)==null?"":MorseCode.get(code));
            }
            if (!text.isEmpty()) {
                text.append(" ");
            }

        }
        System.out.println("Original " + morseCode);
        System.out.println("Result: " + text);
        text.deleteCharAt(text.length()-1);
        return text.toString();

    }*/

    /*public static String decode(String morseCode) {
        if (morseCode == null || morseCode.trim().isEmpty()) {
            return "";
        }

        return Arrays.stream(morseCode.trim().split(" {3}")) // Split by three spaces to get words
                .map(word -> Arrays.stream(word.split(" "))       // Split each word into letters
                        .map(MorseCode::get)                          // Translate each letter using the MorseCode table
                        .filter(Objects::nonNull)                    // Ignore null values
                        .collect(Collectors.joining()))              // Combine letters into a word
                .collect(Collectors.joining(" "));               // Combine words with a single space
    }*/

}
