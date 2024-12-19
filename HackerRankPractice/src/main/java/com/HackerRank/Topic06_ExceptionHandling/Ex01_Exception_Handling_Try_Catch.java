package com.HackerRank.Topic06_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_Exception_Handling_Try_Catch {

	public static void main(String[] args) {
        		
		Scanner scanner = new Scanner(System.in);
				
		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a/b);
		} catch (InputMismatchException ie) {
			System.out.println("java.util.InputMismatchException");
			//System.out.println(ie.toString());		
		} catch (ArithmeticException ae) {
			//System.out.println(ae.getMessage());
			System.out.println(ae.toString());
		}		
		
    }
}
