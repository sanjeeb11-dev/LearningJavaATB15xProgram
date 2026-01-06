package If_Condition;

import java.util.Scanner;

public class Grade_If_else_Statement {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (;;) {   // infinite loop to retry input

            System.out.println("Enter the Subject :");
//            String subject = scan.next();
            String subject = scan.next().toLowerCase(); // It will accept both upper and lower case of letter
//            System.out.println(subject);

            if (subject.equals("maths") ||
                    subject.equals("english") ||
                    subject.equals("science") ||
                    subject.equals("history")) {

                System.out.println("Enter Marks :");
                int marks = scan.nextInt();

                // Pass / Fail check
                if (marks >= 30) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Fail");
                }

                // Grade check
                if (marks >= 90) {
                    System.out.println("Grade is : A");
                }
                else if (marks >= 70) {
                    System.out.println("Grade is : B");
                }
                else {
                    System.out.println("Grade is : C");
                }

                break;   // exit loop after valid input

            } else {
                System.out.println("Enter Valid Subject");
            }
        }
        scan.close();
    }
}
