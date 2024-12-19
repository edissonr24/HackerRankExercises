package com.HackerRank.Topic01_Introduction;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex12_Date_and_Time {


    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	Date date = null;

        try {
            date = new SimpleDateFormat("dd/MM/yy").parse(day + "/" + month + "/" + year);
        } catch (ParseException var5) {
            var5.printStackTrace();
        }

        String diaSemana = (new SimpleDateFormat("EEEE", Locale.ENGLISH)).format(date).toUpperCase();
        return diaSemana;

    }
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        int month = scan.nextInt();

        int day = scan.nextInt();

        int year = scan.nextInt();

        String res = findDay(month, day, year);

        System.out.println(res);
        
    }

}


