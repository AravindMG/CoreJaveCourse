package com.company;

import java.util.Scanner;

public class reverseTheWords {

    public static void main(String[] args) {
        System.out.println("Please enter a string: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] intro = inputString.split("/s");
        String outputString = "";
        for(int i = intro.length - 1; i>=0; i--){
            outputString = outputString + intro[i] + " ";
        }
        System.out.println(outputString);
    }

}
