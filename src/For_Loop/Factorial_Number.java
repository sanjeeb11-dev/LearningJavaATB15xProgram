package For_Loop;

import java.util.Scanner;

public class Factorial_Number {
    static void main(String[] args) {
        System.out.println("Welcome to the Factorial Program");
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a Positive Number");

            if (!scan.hasNextInt()) {
                System.out.println("Enter a valid integer No.");
                scan.next();
                continue;
            }

            int fact = 1;
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
//                System.out.println(n);
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of the No. is " + fact);
            }
            break;
        }
    }
}
