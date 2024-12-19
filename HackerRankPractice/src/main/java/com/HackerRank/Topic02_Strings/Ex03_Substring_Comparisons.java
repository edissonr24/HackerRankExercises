package com.HackerRank.Topic02_Strings;

import java.util.Scanner;

public class Ex03_Substring_Comparisons {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int end = s.length()-k+1;
        smallest = largest = s.substring(0,k);
        for  (int i=0; i<end;i++ ){
            //System.out.println(end + "-Salida " + s.substring(i,i+k));
            if (s.substring(i,i+k).compareTo(smallest) < 0){
                smallest = s.substring(i,i+k);
            } 
            if (s.substring(i,i+k).compareTo(largest) > 0) {
                largest = s.substring(i,i+k);
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
