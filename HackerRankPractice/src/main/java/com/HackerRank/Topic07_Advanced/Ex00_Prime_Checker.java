package com.HackerRank.Topic07_Advanced;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex00_Prime_Checker {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int n1=scanner.nextInt();
			int n2=scanner.nextInt();
			int n3=scanner.nextInt();
			int n4=scanner.nextInt();
			int n5=scanner.nextInt();
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet();
			boolean overload=false;
			for(int i=0;i<methods.length;i++) {
				if(set.contains(methods[i].getName())) {
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Prime {
    void checkPrime(int... numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }     
}
