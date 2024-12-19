package com.HackerRank.Topic04_DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06_List {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			nums.add(scan.nextInt());		
		}
		
		int t = scan.nextInt();
		
		for (int j=0; j<t; j++) {
			String action = scan.next();	
			if (action.equalsIgnoreCase("Insert")) {	
				int x = scan.nextInt();
				int y = scan.nextInt();
				nums.add(x, y);
			}		
			if (action.equalsIgnoreCase("Delete")) {
				int z = scan.nextInt();
				nums.remove(z);
			}
		}		
		//System.out.println(nums.toString());
		//System.out.println("[" + nums.stream().map(Object::toString).collect(Collectors.joining(", ")).toString() + "]");
        for (int i=0; i < nums.size(); i++) {
        	System.out.print(nums.get(i) + " ");
        }
	}
}
