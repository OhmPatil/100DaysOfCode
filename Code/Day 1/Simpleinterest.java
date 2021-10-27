package com.ohm;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        float p = in.nextFloat();
        System.out.print("Enter interest rate: ");
        float r = in.nextFloat();
        System.out.print("Enter time in years: ");
        float t = in.nextFloat();

        float si = p*r*t;
        System.out.println("Calculated simple interest is: "+si);
    }
}
