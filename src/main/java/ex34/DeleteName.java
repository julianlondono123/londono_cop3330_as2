package ex34;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 julian londono
 */
public class DeleteName
{
    public static void main( String[] args )
    {

        Scanner scan = new Scanner (System.in);
        String remove;
        String[] names = {"Chris Julio", "John James", "Rich Dave", "Keith Williams", "Lionel Messi"};
        String new_names [] = new String[names.length-1];
        System.out.println("There are 5 employees");

        print_list(names);

        System.out.println("Enter an employee name to remove");
        remove = scan.nextLine();

        new_names = remove_names(names,remove);

        System.out.println("There are " + new_names.length + " employees");
        print_list(new_names);
    }

    public static void print_list (String[] names) {
        for (int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }

    public static String[] remove_names(String[] names, String remove){
        String new_names [] = new String[names.length-1];
        for (int i=0; i< names.length; i++){
            String test = names[i];
            if (remove.equals(test)){
                System.arraycopy(names, 0, new_names, 0, i);
                System.arraycopy(names,  i+ 1, new_names, i, names.length - i - 1);
            }
        }
        return new_names;
    }
}
