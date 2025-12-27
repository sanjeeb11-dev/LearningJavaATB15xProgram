package If_Condition;

import java.util.Scanner;

public class If_else_Statement {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Subject :");
        String subject = scan.next().toLowerCase();

        if (subject.equals("maths") || subject.equals("english") || subject.equals("science") || subject.equals("history")){

            System.out.println("Enter Marks : ");
            int Marks = scan.nextInt();

            String result = Marks >= 30 ? "Pass" : "Fail";
            System.out.println(result);

            char Score = Marks > 90 ? 'A' : (Marks < 90 && Marks > 70) ? 'B' : 'C';
            System.out.println("Grade is : \n" + Score);
        }
        else {
            System.out.println("Enter Valid Subject");
        }
        scan.close();
    }
}


