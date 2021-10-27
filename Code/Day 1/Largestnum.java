package com.ohm;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = in.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = in.nextFloat();

        if (num1>num2){
            System.out.println(num1+" is larger.");
        }
        else if (num2>num1){
            System.out.println(num2+" is larger.");
        }
        else{
            System.out.println("Both values are equal.");
        }
    }
}
