package org.example;

import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class PaymentCalculator {
     public static double calculateMonthsUntilPaidOff(double p, double b, double i){
        double months, num, den, exp, itt;
        exp = Math.pow((1.00 + i), 30.00);
        num = Math.log(1 + ((b * (1 - exp)) / p)) * (-1.00 / 30.00);
        den = Math.log(1.00+i);
        months = num/den;
        months = (int)(Math.ceil(months));

        return months;
    }
}
