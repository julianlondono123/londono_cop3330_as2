package ex25;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class password_strength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;

        System.out.println("Enter your password");
        password = input.next();

        switch (passwordValidator(password)) {
            case 1 :
                System.out.println("The password " + password + " is a very strong password");
                break;
            case 2 :
                System.out.println("The password " + password + " is a strong password");
                break;
            case 3:
                System.out.println("The password " + password + " is a weak password");
                break;
            case 4:
                System.out.println("The password " + password + " is a very weak password");
                break;

        }

    }

    static int passwordValidator(String password) {
        char input[] = password.toCharArray();
        int length = password.length();
        boolean is_special = false;
        boolean is_number = false;
        boolean is_letter = false;
        String special ="!@#$%^&*()-+";

        for (char i : input) {
            if (Character.isDigit(i))
                is_number = true;
            if (special.indexOf(i) != -1)
                is_special = true;
            if (Character.isAlphabetic(i))
                is_letter = true;
        }

        if (is_number && is_special && is_special && 8 <= length)
            return 1;
        else if(is_number && is_letter && 8 <= length)
            return 2;
        else if (!is_number && is_letter && length <= 8)
            return 3;
        else
            return 4;

    }
}
