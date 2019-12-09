package com.company;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int space = n -1;
        int number = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=number; k++){
                System.out.print(k);
            }
            System.out.println();
            space--;
            number += 2;
        }
    }

}

