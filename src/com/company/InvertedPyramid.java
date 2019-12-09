package com.company;

import java.util.Scanner;

public class InvertedPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int space1 = n - 1;
        int star1 = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<space1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<star1; k++){
                System.out.print("*");
            }
            System.out.println();
            space1--;
            star1 += 1;
        }


        int space = n - n;
        int star = n;

        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int k=0; k<star; k++){
                System.out.print("*");
            }
            System.out.println();
            space++;
            star -= 1;
        }
    }
}

