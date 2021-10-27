package com.ohm;

import java.util.Scanner;

public class Rupeetodollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value in rupees: ");
        float rs = in.nextFloat();
        float doll = rs / 74.23f;
        System.out.println("Value in dollars is: "+doll);

    }
}
