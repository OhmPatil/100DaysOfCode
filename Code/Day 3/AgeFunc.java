package com.ohm;

import java.util.Scanner;

public class AgeFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();
        vote(age);

    }

    static void vote(int age){
        if (age >= 18){
            System.out.println("ELIGIBLE");
        }
        else
            System.out.println("NOT ELIGIBLE");
    }
}
