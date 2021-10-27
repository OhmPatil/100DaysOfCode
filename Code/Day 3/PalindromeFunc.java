package com.ohm;

import java.util.Scanner;

public class PalindromeFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean result = palindrome(num);

        if (result) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
    static boolean palindrome(int num){
        int og = num;
        int newnum=0;
        int rem=0;
        while (num>0){
            rem = num % 10;
            newnum = (newnum*10) + rem;
            num /= 10;
        }
        return newnum == og;
    }
}
