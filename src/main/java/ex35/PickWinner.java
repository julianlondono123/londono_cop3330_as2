package ex35;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 julian londono
 */
public class PickWinner
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner (System.in);
        String input ="";
        boolean notblank = true;
        List <String> names = new ArrayList<String>();
        int index = 0;

        while(notblank){
            System.out.println("Enter a name");
            input = scan.nextLine();

            if(input.length()>0){
                names.add(index, input);
                index++;
            }
            else {

                System.out.println("The winner is ..." + get_winner(names));
                notblank = false;
            }
        }
    }

    public static String get_winner (List<String> names){
        int randomNum;
        Random rand = new Random();
        randomNum = rand.nextInt((names.size() - 1) + 1) ;
        return names.get(randomNum);
    }
}
