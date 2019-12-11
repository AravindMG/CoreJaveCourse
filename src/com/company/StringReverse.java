package com.company;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println("Please enter a word : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = "";
        for(int i = s.length()-1; i >= 0; i--){
            word = word + s.charAt(i);
        }
        System.out.println(word);
    }

}
