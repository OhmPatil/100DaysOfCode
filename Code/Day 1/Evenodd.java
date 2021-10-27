package com.ohm;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num<1){
            System.out.println("Enter a positive integer !");
        }
        else if (num%2==0){
            System.out.println("EVEN number");
        }
        else{
            System.out.println("ODD number");
        }


    }
}
