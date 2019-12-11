package com.company;

import java.util.Scanner;

public class BlankStar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int space = n -1;
        int star = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int k=0; k<star; k++){
                if (k==0 || k==(star-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            space--;
            star += 2;
        }
    }

}
