package com.HackerRank.Topic04_DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Ex08_Stack {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {		
			String input = sc.next();                  // Lee cada caracter
	        //Complete the code
			Stack<Character> theStack = new Stack(); 
			for(int i=0; i < input.length(); i++) {				
				if (theStack.isEmpty()){
					theStack.push(input.charAt(i));
					System.out.println("Pushing " + input.charAt(i));
				} else {
					System.out.println("Switch " + input.charAt(i));
					switch (input.charAt(i)) {
						case '}' : if (theStack.peek() == '{') {
								   	   theStack.pop();
								   } break;
						case ']' : if (theStack.peek() == '[') {
							           theStack.pop();
						           } break;
						case ')' : if (theStack.peek() == '(') {
							           theStack.pop();
						           } break;
						default: theStack.push(input.charAt(i));
					}
				}
			}
			System.out.println(theStack.isEmpty());
		}
	}

}
