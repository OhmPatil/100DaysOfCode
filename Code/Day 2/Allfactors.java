package com.ohm;

import java.util.Scanner;

public class Allfactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.print("Factors of "+num+" are: ");
        for (int i=1 ; i<=num ; i++){
            if(num%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
