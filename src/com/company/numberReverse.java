package com.company;

public class numberReverse {

    public static void main(String[] args) {
        int n = 1234;
        int reverse = 0;
        while(n!=0)
        {

            int r = n % 10; //for remainder
            n=n/10;
            reverse = (reverse*10)+r;
        }
        System.out.println(reverse);
    }
}
