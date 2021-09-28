package ex24;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 julian londono
 */
public class Anagram
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String string1, string2;
        boolean check;

        System.out.println( "Enter two strings and I will tell you if they are anagrams" );
        System.out.println("Enter the first string:");
        string1 = input.next();

        System.out.println("Enter the second string:");
        string2 = input.next();

        check = anagram_check(string1, string2);

        if (check) {
            System.out.println("The words " + string1 + " and " + string2 + " are anagrams");
        }
        else {
            System.out.println("The words " + string1 + " and " + string2 + " are  not anagrams");
        }


    }
    static boolean anagram_check(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char word1[] = string1.toCharArray();
        char word2[] = string2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);

    }


}
