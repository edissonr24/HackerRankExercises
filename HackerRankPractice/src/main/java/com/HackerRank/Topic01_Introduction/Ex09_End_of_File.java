package com.HackerRank.Topic01_Introduction;

import java.util.Scanner;

public class Ex09_End_of_File {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; scan.hasNext(); i++) {
			System.out.println(i + " " + scan.nextLine());
		}		
		
	}
}
