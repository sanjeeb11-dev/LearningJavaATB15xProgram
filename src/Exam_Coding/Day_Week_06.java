package Exam_Coding;

//Write a Java program to print the name of the day based on a number (1–7) using a switch statement.

import java.util.Scanner;

public class Day_Week_06 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter the No. of a day");

            if (!scan.hasNextInt()) {
                System.out.println("Enter a Number Only");
                scan.next();
                continue;
            }
            int day = scan.nextInt();

            if (day < 1 || day > 7) {
                System.out.println("Enter a Number between 1 to 7");
                continue;
            }
            switch (day) {
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
            break;
        }
        scan.close();
    }
}
