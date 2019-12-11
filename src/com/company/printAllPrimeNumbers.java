package com.company;

import java.util.Scanner;

public class printAllPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int n2 = sc.nextInt();

        while (n1 < n2) {
            boolean check = false;
            for (int i = 2; i <= n1 / 2; ++i) {
                // condition for nonprime number
                if (n1 % i == 0) {
                    check = true;
                    break;
                }
            }
            if (check!=true)
                System.out.print(n1 + " ");
            ++n1;
        }
    }
}
