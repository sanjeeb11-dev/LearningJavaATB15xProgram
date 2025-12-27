package Class_Task;

/*
calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F)
based on the following grading scale:

A : 90-100
B : 80-89
C : 70-79
D : 60-69
F : 0-59
*/

import java.util.Scanner;

public class Grade_Calculator {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Mark : ");
        int mark = scan.nextInt();

        if(mark >= 90 && mark<=100){
            System.out.println("Grade : A");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("Grade : B");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("Grade : C");
        } else if (mark >= 60 && mark <=69) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }
        scan.close();
    }
}
