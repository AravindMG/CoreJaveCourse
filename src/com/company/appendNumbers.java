package com.company;

import java.util.Scanner;

public class appendNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int n2Copy = n2;
        int count = 0;
        while(n2!= 0) {
            int r = n2 % 10;
            n2 = n2/10;
//            count++;
            n1 = n1*10;
        }
//        System.out.println(count);
//        System.out.println(n1);
        n1 = n1 + n2Copy;
        System.out.println(n1);
    }
}
