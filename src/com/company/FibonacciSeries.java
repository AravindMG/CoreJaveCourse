package com.company;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i=0; i<n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
            System.out.println(first);
        }
    }

}
