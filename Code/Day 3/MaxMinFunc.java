package com.ohm;

import java.util.Scanner;

public class MaxMinFunc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();
        int maxAns = max(num1, num2, num3);
        int minAns = min(num1, num2, num3);
        System.out.println("Maximum is: "+maxAns);
        System.out.println("Minimum is: "+minAns);
    }

    static int max(int a, int b, int c){
        int ans = Math.max(a, Math.max(b, c));
        return ans;
    }

    static int min(int a, int b, int c){
        int ans = Math.min(a, Math.min(b, c));
        return ans;
    }
}

