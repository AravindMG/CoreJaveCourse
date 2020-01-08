package com.company;

import java.util.Scanner;

public class leapYear {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a valid year: ");
        int year = scanner.nextInt();

        if (year % 400 == 0)
        {
            System.out.println("The year provided is a leap year: ");
        }
        else if (year % 100 == 0)
        {
            System.out.println("The year provided is not a leap year: ");
        }
        else if (year % 4 == 0)
        {
            System.out.println("The year provided is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}
