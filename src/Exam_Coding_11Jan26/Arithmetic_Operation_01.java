package Exam_Coding_11Jan26;

//Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.

import java.util.Scanner;

public class Arithmetic_Operation_01 {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (;;) {
            System.out.println("Enter Two Numbers");

            if (!scan.hasNextInt()) {
                System.out.println("Enter Integer Only");
                scan.next();
                continue;
            }

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            if (num1 > num2) {
                int Add = num1 + num2;
                System.out.println("Sum of two numbers is " + Add);
                int Sub = num1 - num2;
                System.out.println("Subtraction of two number is " + Sub);
                int Mul = num1 * num2;
                System.out.println("Multiplication of two number is " + Mul);
                int Div = num1 / num2;
                System.out.println("Division of two number is " + Div);
                int Mod = num1 % num2;
                System.out.println("Modulus of two number is " + Mod);
            } else {
                int Add = num1 + num2;
                System.out.println("Sum of two numbers is " + Add);
                int Sub = num2 - num1;
                System.out.println("Subtraction of two number is " + Sub);
                int Mul = num1 * num2;
                System.out.println("Multiplication of two number is " + Mul);
                int Div = num2 / num1;
                System.out.println("Division of two number is " + Div);
                int Mod = num2 % num1;
                System.out.println("Modulus of two number is " + Mod);
            }
            break;
        }
        scan.close();
    }
}
