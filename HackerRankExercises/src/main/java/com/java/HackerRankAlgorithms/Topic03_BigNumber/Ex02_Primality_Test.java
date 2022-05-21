package com.java.HackerRankAlgorithms.Topic03_BigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex02_Primality_Test {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
	    BigInteger n = in.nextBigInteger();
	    in.close();
	    if (n.isProbablePrime(50)) {
	        System.out.println("prime");
	    } else {
	        System.out.println("not prime");
	    }
    }

}
