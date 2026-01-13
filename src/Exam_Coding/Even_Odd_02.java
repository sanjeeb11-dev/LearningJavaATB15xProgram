package Exam_Coding;

//Write a Java program to check whether a given number is even or odd using arithmetic operators.

import java.util.Scanner;

public class Even_Odd_02 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter a Number");

            if (!scan.hasNextInt()) {
                System.out.println("Enter a integer");
                scan.next();
                continue;
            }
            int num = scan.nextInt();

            if (num<0){
                System.out.println("Enter a Positive Number");
                continue;
            }
            if (num % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
            break;
        }
        scan.close();
    }
}
