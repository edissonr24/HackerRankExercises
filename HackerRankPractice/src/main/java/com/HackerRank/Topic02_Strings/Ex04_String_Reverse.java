package com.HackerRank.Topic02_Strings;

import java.util.Scanner;

public class Ex04_String_Reverse {

	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer result = new StringBuffer();
        /* Enter your code here. Print output to STDOUT. */
        for (int i = A.length()-1; i >= 0 ; i--) {
            result.append(A.substring(i, i+1));
        }
        String resultCompare = result.toString().equals(A)?"Yes":"No";
        System.out.println(resultCompare);
    }
}
