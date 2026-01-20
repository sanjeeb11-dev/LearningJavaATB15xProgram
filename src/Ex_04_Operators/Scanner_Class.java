package Ex_04_Operators;

import java.util.Scanner;

public class Scanner_Class {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Subject : ");
        String subject = scan.next();
        System.out.println("Enter Marks : ");
        int Marks = scan.nextInt();

            String result = Marks >= 30 ? "Pass" : "Fail";
            System.out.println(result);

            char Score = Marks > 90 ? 'A' : (Marks < 90 && Marks > 70) ? 'B' : 'C';
            System.out.println("Grade is : \n" + Score);

        scan.close();
    }
}
