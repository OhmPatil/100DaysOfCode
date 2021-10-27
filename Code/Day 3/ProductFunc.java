package com.ohm;

import java.util.Scanner;

public class ProductFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float res = sum(num1 , num2);
        System.out.println("Product is: "+res);
    }

    static float sum(float a, float b){
        float ans = a * b;
        return ans;
    }
}

