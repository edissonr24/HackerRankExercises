package com.HackerRank.Topic01_Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex13_Currency_Formatter {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale locale = new Locale("en", "US");
        NumberFormat currentFormatter = NumberFormat.getCurrencyInstance(locale);
        String us = currentFormatter.format(payment);
        
        locale = new Locale("en", "IN");
        currentFormatter = NumberFormat.getCurrencyInstance(locale);
        String india = currentFormatter.format(payment);
        
        locale = new Locale("zh", "CN");
        currentFormatter = NumberFormat.getCurrencyInstance(locale);
        String china = currentFormatter.format(payment);
        
        locale = new Locale("fr", "FR");
        currentFormatter = NumberFormat.getCurrencyInstance(locale);
        String france = currentFormatter.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
