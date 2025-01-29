package com.java.CodeWarAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class DnaStrand {

    public static String makeComplement(String dna) {
        //Your code
        Map<Character, Character> adn = new HashMap<>();
        adn.put('A', 'T');
        adn.put('T', 'A');
        adn.put('C', 'G');
        adn.put('G', 'C');

        StringBuilder solution = new StringBuilder();
        for (Character c : dna.toCharArray()) {
            solution.append(adn.get(c));
        }
        return solution.toString();
    }

}
