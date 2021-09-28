package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import  java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 julian londono
 */
public class search_records
{
    public static void main( String[] args )
    {
        String [] e1 = {"John Johnson","Manager","2016-12-31"};
        String [] e2 = {"Tou Xiong","Software Enginner", "2016-10-05"};
        String [] e3 = {"Michaela Michaelson","Direct Manager", "2015-12-19"};
        String [] e4 = {"Jake Jacobson","Programmer", ""};
        String [] e5 = {"Jacquelyn Jackson","DBA", ""};
        String [] e6 = {"Sally Webber","Web Developer", "2015-12-18"};

        Map<String, String[]> map = new HashMap<>();
        map.put("John Johnson", e1);
        map.put("Tou Xiong", e2);
        map.put("Michaela Michaelson", e3);
        map.put("Jake Jacobson", e4);
        map.put("Jacquelyn Jackson", e5);
        map.put("Sally Webber", e6);

        TreeMap<String, String[]> sorted_map = new TreeMap<>();

        sorted_map.putAll(map);

        System.out.println("Name                   | Position          | Seperation Date");
        System.out.println("----------------------------------------------------");
        System.out.println("");

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a search string");
        String search = scan.nextLine();

        for (Map.Entry<String, String[]> entry : sorted_map.entrySet()){
            if (entry.getKey().contains(search)){
            System.out.printf("%-10s", entry.getValue()[0]);
            System.out.printf("%-10s", entry.getValue()[1]);
            System.out.printf("%-10s", entry.getValue()[2]);
            System.out.println("");
        }


    }
    }
}
