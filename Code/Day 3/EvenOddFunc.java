package com.ohm;

import java.util.Scanner;

public class EvenOddFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        evenodd(num);

    }
    static void evenodd(int num){
        if (num%2 == 0){
            System.out.println("Number is EVEN");
        }
        else
            System.out.println("Number is ODD");
    }
}
