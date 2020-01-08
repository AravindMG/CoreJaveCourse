package com.company;

public class arrayMinNumber {

    public static void main(String[] args) {
        int number[] = {22, 10, 11, 24, 8, 48, 22, 4};
        int minValue = number[0];
        for (int i = 0; i < number.length; i++) {
            if(number[i] < minValue){
                minValue = number[i];
            }
        }
        System.out.println(minValue);
    }

}

