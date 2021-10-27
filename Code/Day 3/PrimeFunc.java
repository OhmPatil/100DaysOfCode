package com.ohm;

import java.util.Scanner;

public class PrimeFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean res = prime(num);
        System.out.print(res);

    }

    static boolean prime(int num){
        if (num<=1){
            return false;
        }
        int c = 2;
        while(c <= num){
            if (num % c == 0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
