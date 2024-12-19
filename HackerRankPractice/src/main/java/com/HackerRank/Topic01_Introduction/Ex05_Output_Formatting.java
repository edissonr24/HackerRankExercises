package com.HackerRank.Topic01_Introduction;

import java.util.Scanner;

public class Ex05_Output_Formatting {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            String n = String.format("%03d", x);
            StringBuffer linea = new StringBuffer(s1);
            int length = linea.length();
            while (length < 15) {
            	linea.append(" ");	
            	length++;		
			}
            linea.append(n);
            System.out.println(linea);
        }
        System.out.println("================================");

	}

//	String.format("%03d", 1)  // => "001"
//  │││   └── print the number one
//  ││└────── ... as a decimal integer
//  │└─────── ... minimum of 3 characters wide
//  └──────── ... pad with zeroes instead of spaces

}
