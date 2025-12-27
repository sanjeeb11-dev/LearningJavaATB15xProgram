package If_Condition;

import java.util.Scanner;

public class Number_Between {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scan.nextInt();

        if(number >= 70 && number <= 90){
            System.out.println("Proceed Further");
        } else {
            System.out.println("Enter Number in between 70 to 90");
        }
        scan.close();
    }
}
