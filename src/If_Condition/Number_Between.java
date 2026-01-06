package If_Condition;

/*System should accept a number only between 70 to 90
Then only the system will allow user to proceed Further
Otherwise it will through validation
I want system should ask me to enter the number multiple times*/

import java.util.Scanner;

public class Number_Between {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Enter the number :");
            int number = scan.nextInt();

            if (number >= 70 && number <= 90) {
                System.out.println("Proceed Further");
                break;
            } else {
                System.out.println("Enter Number in between 70 to 90");
            }
//            scan.close(); //using for loop in which scanner close not required
        }
    }
}
