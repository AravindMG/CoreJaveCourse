package com.company;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        System.out.println("Please enter a number to find the factorial of that number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of number " + n + " is " + fact);
    }
}
