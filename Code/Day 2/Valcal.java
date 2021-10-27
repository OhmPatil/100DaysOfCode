package com.ohm;

import java.util.Scanner;

public class Valcal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = in.nextFloat();
        System.out.print("Enter operator: ");
        char op = in.next().charAt(0);
        System.out.print("Enter second number: ");
        float num2 = in.nextFloat();

        float res=0;

        if (op == '+'){
            res = num1 + num2;
        }
        else if (op == '-'){
            res = num1 - num2;
        }
        else if (op == '*'){
            res = num1 * num2;
        }
        else if (op == '/'){
            res = num1 / num2;
        }
        else{
            System.out.println("Enter valid operator!!");
        }
        System.out.println("Value is: " +res);
    }
}
