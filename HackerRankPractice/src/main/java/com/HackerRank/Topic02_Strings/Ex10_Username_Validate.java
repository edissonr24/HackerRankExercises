package com.HackerRank.Topic02_Strings;

import java.util.Scanner;

public class Ex10_Username_Validate {

	private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[A-Za-z_][A-Za-z0-9_]{7,29}$";
}
