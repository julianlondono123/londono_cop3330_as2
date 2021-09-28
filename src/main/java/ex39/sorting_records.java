package org.example;

import java.net.Inet4Address;
import java.util.*;
import java.lang.Math;
import java.util.HashMap;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 julian londono
 */
public class sorting_records

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
        map.put("Johnson", e1);
        map.put("Xiong", e2);
        map.put("Michaelson", e3);
        map.put("Jacobson", e4);
        map.put("Jackson", e5);
        map.put("Webber", e6);

        TreeMap <String, String[]> sorted_map = new TreeMap<>();

        sorted_map.putAll(map);

        System.out.println("Name                   | Position          | Seperation Date");
        System.out.println("----------------------------------------------------");
        System.out.println("");
        for (Map.Entry<String, String[]> entry : sorted_map.entrySet()){
            System.out.printf("%-10s", entry.getValue()[0]);
            System.out.printf("%-10s", entry.getValue()[1]);
            System.out.printf("%-10s", entry.getValue()[2]);
            System.out.println("");
    }


    }
}
