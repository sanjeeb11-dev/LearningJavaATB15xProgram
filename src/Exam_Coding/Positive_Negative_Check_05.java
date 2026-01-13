package Exam_Coding;

//Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.

import java.util.Scanner;

public class Positive_Negative_Check_05 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter a number");

            if (!scan.hasNextInt()) {
                System.out.println("Enter a Integer");
                scan.next();
                continue;
            }
            int num = scan.nextInt();

            String Number = (num > 0) ? (num < 0 ? "Negative" : "positive") : "Zero";
            System.out.println("Given Number is " + Number);
            break;
        }
        scan.close();
    }
}
