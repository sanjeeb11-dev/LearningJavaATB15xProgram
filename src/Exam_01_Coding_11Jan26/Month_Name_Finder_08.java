package Exam_01_Coding_11Jan26;

//Write a Java program to print the month name based on the month number (1–12) using a switch statement.

import java.util.Scanner;

public class Month_Name_Finder_08 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter a Number of day of the month");

            if (!scan.hasNextInt()) {
                System.out.println("Enter a Integer");
                scan.next();
                continue;
            }
            int day = scan.nextInt();

            if (day < 1 || day > 12) {
                System.out.println("Enter a Number between 1 to 12");
                continue;
            }
            switch (day) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
            break;
        }
        scan.close();
    }
}
