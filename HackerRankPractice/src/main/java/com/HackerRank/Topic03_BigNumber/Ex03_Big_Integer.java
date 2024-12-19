package com.HackerRank.Topic03_BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex03_Big_Integer {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number1 = scanner.nextBigInteger();
        BigInteger number2 = scanner.nextBigInteger();
        
        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
    }

}
