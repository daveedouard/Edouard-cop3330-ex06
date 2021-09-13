/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex06;

import java.util.Scanner;
import java.util.Calendar;

public class exercise06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String agestr = input.nextLine();
        int age = Integer.parseInt(agestr);

        System.out.print("At what age would you like to retire? ");
        String retirestr = input.nextLine();
        int retire = Integer.parseInt(retirestr);

        int difference = retire-age;

        //Getting the year//
        Calendar currYear = Calendar.getInstance();
        int year = currYear.get(Calendar.YEAR);
        int retireyear = year+difference;

        System.out.print("You have "+difference+" years until you can retire.\nIt's "+year+", so you can retire in "+retireyear+".");

    }
}
