package com.HackerRank.Topic01_Introduction;

import java.util.Scanner;

public class Ex10_Static_Initializer_Block {
	
	private static int B;
	private static int H;
	private static boolean flag = true;
	
	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		
		try {
			if (B <= 0 || H <= 0 ) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}		
		
	}

	public static void main(String[] args) {
		if (flag) {
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
