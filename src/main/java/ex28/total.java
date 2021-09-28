package ex28;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 julian londono
 */
public class total
{
    public static void main( String[] args )
    {

        System.out.println("The total is " + count());
    }

    public static int count () {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for (int i=0;i<5;i++){
            System.out.println("Enter a number:");
            count = count + scan.nextInt();
        }
        return count;
    }
}
