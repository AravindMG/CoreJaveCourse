package com.company;

import java.util.Scanner;

public class ReversePyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int spaceReduce = n - 1;
        int space = n - spaceReduce;
        int star = n + (n -1);

        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<star; k++){
                System.out.print("*");
            }
            System.out.println();
            space++;
            star -= 2;
        }
    }

}
/*
1 = 1
2 = 3
3 = 5
4 = 7
5 = 9
6 = 11
 */