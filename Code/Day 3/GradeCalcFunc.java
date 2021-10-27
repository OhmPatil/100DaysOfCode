package com.ohm;

import java.util.Scanner;

public class GradeCalcFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter marks: ");
        float marks = in.nextFloat();
        grade(marks);
    }

    static void grade(float marks){

        if (marks >= 91 && marks <=100){
            System.out.println("Grade AA");
        }
        if (marks >= 81 && marks <=90) System.out.println("Grade AB");
        if (marks >= 71 && marks <=80){
            System.out.println("Grade BB");
        }
        if (marks >= 61 && marks <=70){
            System.out.println("Grade BC");
        }
        if (marks >= 51 && marks <=60){
            System.out.println("Grade CD");
        }
        if (marks >= 41 && marks <=50){
            System.out.println("Grade DD");
        }
        if (marks >= 0 && marks <=40){
            System.out.println("FAIL");
        }
        else
            System.out.println("Enter Valid Marks !!");
    }
}

