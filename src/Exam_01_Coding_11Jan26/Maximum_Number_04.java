package Exam_01_Coding_11Jan26;

//Write a Java program to find the maximum of two numbers using the ternary operator.

import java.util.Scanner;

public class Maximum_Number_04 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter Two Numbers");

            if (!scan.hasNextInt()) {
                System.out.println("Enter a Integer");
                scan.next();
                continue;
            }
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            int Greater = Math.max(num1, num2);
            System.out.println("Greater Number is "+ Greater);
            break;
        }
        scan.close();
    }
}
