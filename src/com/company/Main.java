package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        if(age<0)
        {
            System.out.println("Please enter the right age");
        }
        else if(age<10)
        {
            System.out.println("He is a Kid");
        }
        else if(age<18)
        {
            System.out.println("He is Young");
        }
        else if(age<25)
        {
            System.out.println("He is a adult");
        }
        else if(age<40)
        {
            System.out.println("He is matured");
        }
        else
        {
            System.out.println("He is older");
        }
    }
}
