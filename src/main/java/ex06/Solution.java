package ex06;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.*;
import java.lang.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int current_year = Calendar.getInstance().get(Calendar.YEAR);

        // get age
        System.out.print("What is your current age? ");
        int age = in.nextInt();

        // get retirement age
        System.out.print("At what age would you like to retire? ");
        int retire_age = in.nextInt();

        //current year equation
        int years_left = retire_age - age;
        System.out.print("You have " + years_left + " years left until you can retire.");

        // retirement years equation
        int retire_year = current_year + years_left;
        System.out.print("You have " + current_year + ", so you can retire in " + retire_year +  ".");
    }
}
