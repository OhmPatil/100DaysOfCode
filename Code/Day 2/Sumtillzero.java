package com.ohm;

import java.util.Scanner;

public class Sumtillzero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 1;
        int sum = 0;
        while (num != 0) {

            System.out.print("Enter an integer: ");
            num = in.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum of all integers: " + sum);
    }

}