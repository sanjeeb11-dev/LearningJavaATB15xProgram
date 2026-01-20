package Ex_05_If_Condition;

import java.util.Scanner;

public class Grade_Classification {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject:");
        String subject = sc.next().toLowerCase();

        // Validate subject
        if (subject.equals("maths") ||
                subject.equals("history") ||
                subject.equals("pt") ||
                subject.equals("economy")) {

            System.out.println("Enter Marks:");
            int marks = sc.nextInt();

            //Pass/Fail
            if (marks >= 30) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

            // Grade Check
            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 70) {
                System.out.println("Grade B");
            }
        }    else {
            System.out.println("Invalid Subject");
        }
        sc.close();
    }
}
