package Exam_Coding;

//Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.

import java.util.Scanner;

public class Simple_Calculator_07 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter a Calculator Operation");

            if (scan.hasNextInt()) {
                System.out.println("Enter only string value");
                scan.next();
                continue;
            }
            String Calculator = scan.nextLine();
            Calculator = Calculator.toLowerCase();

            System.out.println("Enter two Numbers");
            if (scan.hasNextInt()) {
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();

                switch (Calculator) {
                    case "addition":
                        System.out.println(num1 + num2);
                        break;
                    case "subtraction":
                        System.out.println(num1 - num2);
                        break;
                    case "multiplication":
                        System.out.println(num1 * num2);
                    case "division":
                        System.out.println(num1 / num2);
                }
            }
            break;
        }
        scan.close();
    }
}
