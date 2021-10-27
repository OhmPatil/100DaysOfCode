package com.ohm;

import java.util.Scanner;

public class Largesttillzero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 1;
        int large = 0;

        while (num != 0){
            System.out.print("Enter an integer: ");
            num = in.nextInt();

            if (num>large){
                large = num;
            }
        }
        System.out.println("Largest integer is: "+large);
    }
}
