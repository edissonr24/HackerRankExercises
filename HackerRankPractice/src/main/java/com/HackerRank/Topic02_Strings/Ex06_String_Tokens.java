package com.HackerRank.Topic02_Strings;

import java.util.Scanner;

public class Ex06_String_Tokens {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.trim();
        if(s.equals("")) {
            System.out.println("0");
            return;
        }
        
        String pattern = "[ !,?._'@]+";
        String[] items = s.trim().split(pattern);
        System.out.println(items.length);
        for(int i = 0; i < items.length; i++) {
        	System.out.println(items[i]);
        }
        scan.close();
    }
}
