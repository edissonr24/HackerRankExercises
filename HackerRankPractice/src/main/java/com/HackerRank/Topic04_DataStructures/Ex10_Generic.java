package com.HackerRank.Topic04_DataStructures;

import java.lang.reflect.Method;

public class Ex10_Generic {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}

class Printer {
   //Write your code here
	public <T> void printArray(T[] arrayToPrint) {
		for (T value : arrayToPrint) {
			System.out.println(value);
		}
	}
}