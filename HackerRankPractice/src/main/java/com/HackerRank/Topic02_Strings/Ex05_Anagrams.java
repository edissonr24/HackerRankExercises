package com.HackerRank.Topic02_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_Anagrams {

	static boolean isAnagram(String a, String b) {
        // Complete the function
		char arrayA[] = new char[a.length()];
		char arrayB[] = new char[b.length()];
		
		for (int i = 0; i < a.length(); i++) {
			arrayA[i] = a.charAt(i);
			arrayB[i] = b.charAt(i);
		}
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		
		for (int j=0; j < a.length();j++) {
			if (arrayA[j] != arrayB[j]) {
				return false;
			}
		}
		return true;
		
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
