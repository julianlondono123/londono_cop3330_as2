package ex26;

import org.example.PaymentCalculator;

import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 julian londono
 */
public class creditcard
{
    public static void main( String[] args )
    {
        double i, b, p, months;
        Scanner input = new Scanner (System.in);
        System.out.println( "What is your balance?");
        b = input.nextDouble();
        System.out.println( "What is the APR on the card??");
        i = input.nextDouble()/365.00;
        System.out.println( "What is the monthly payment you can make?");
        p = input.nextDouble();


       months = PaymentCalculator.calculateMonthsUntilPaidOff(100.00, 5000.00, 12.00/(365.00*100));
       System.out.println("It will take " + months + " months to pay off your credit card");
    }
}
