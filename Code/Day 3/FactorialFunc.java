package com.ohm;

import java.util.Scanner;

public class FactorialFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Factorial is: "+factorial(num));
    }

    static int factorial(int num) {
        int i = 1;
        int fact=1;
        while (i <= num) {
            fact = i * fact;
            i++;
        }
        return fact;
    }
}

