package ex31;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class heartrate
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double hr,age;
        System.out.println( "How old are you?" );
        age = scan.nextDouble();
        System.out.println("What is your resting heart rate");
        hr = scan.nextDouble();

        System.out.println("Resting Pulse: " + hr + "             " + "Age: " + age + "\n");
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|-------");

        for(int i=55; i<96; i=i+5) {
            System.out.println(i +"%          | " + karv(age,hr,i) + " bpm");
        }
    }
    public static double karv (double age, double hr, double percent){
        return Math.round((((220.00-age) - hr) * (percent/100.00)) + hr);
    }
}
