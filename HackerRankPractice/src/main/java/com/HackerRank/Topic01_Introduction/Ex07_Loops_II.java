package com.HackerRank.Topic01_Introduction;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_Loops_II {	
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            StringBuffer result = new StringBuffer();      
            for (int j = 1; j <= n; j++) {
            	int total = 0;
            	double acum = 0;  
            	for (int k = 0; k < j; k++) {
            		acum += (Math.pow(2, k) * b);
            	}
            	total = (int) (a + acum);
            	result.append(total + " ");
            }
            System.out.println(result);
            
        }
        in.close();
    }
}
