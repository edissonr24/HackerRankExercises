package com.HackerRank.Topic04_DataStructures;

import java.util.Scanner;

public class Ex04_Subarray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int i = 0;
        while(i < n) {
        	a[i] = scan.nextInt();
        	i++;
        }
        scan.close();
        
        int count = 0;
        for (int inicio = 0; inicio < a.length; inicio++) {

        	for (int fin = inicio; fin < a.length; fin++) {
        		int suma = 0;
        		for (int j = inicio; j<=fin; j++) {
        			suma += a[j];
        		}
        		if (suma < 0) {
        			//System.out.println("Suma: " + suma);
            		count++;
        		}        		
        	}
        }
        System.out.println(count);	
	}
}
