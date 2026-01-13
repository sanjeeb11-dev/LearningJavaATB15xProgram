package Exam_Coding_11Jan26;

//Write a Java program to reverse a given number using a do-while loop.

import java.util.Scanner;

public class Reverse_Number_11 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter a Number");
            if (!scan.hasNextInt()) {
                System.out.println("Enter only Numbers");
                scan.next();
                continue;
            }
            int num = scan.nextInt();

            int reverse = 0;
            do {
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }
            while (num != 0);
            System.out.println("Reverse of the Number is " + reverse);
            break;
        }
    }
}
