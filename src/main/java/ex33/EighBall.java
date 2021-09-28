package ex33;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 julian londono
 */
public class EighBall
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your question?");
        String input = scan.next();
        System.out.println(random_response());
    }
    public static String random_response (){
        Random rand = new Random();
        String[] response = {"Yes", "No", "Maybe", "Ask again later"};
        int randomnum = rand.nextInt(4) ;
        return response[randomnum];
    }
}
