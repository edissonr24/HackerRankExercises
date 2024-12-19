package com.HackerRank.Topic02_Strings;

import java.util.Scanner;

public class Ex01_Strings_Introduction {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        System.out.println(A.length()+B.length());
        
        String compare = A.compareTo(B) > 0?"Yes":"No";
        System.out.println(compare);
        
        System.out.println(A.substring(0,1).toUpperCase() +  A.substring(1) + " " + 
        		B.substring(0,1).toUpperCase() + B.substring(1));
        
    }
}
