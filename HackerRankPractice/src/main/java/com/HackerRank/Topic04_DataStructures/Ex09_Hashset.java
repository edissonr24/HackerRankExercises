package com.HackerRank.Topic04_DataStructures;

import java.util.HashSet;
import java.util.Scanner;

public class Ex09_Hashset {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        HashSet<String> names = new HashSet<String>();
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            names.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(names.size());
        }

   }

}
