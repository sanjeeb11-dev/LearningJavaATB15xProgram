package Operators;

import java.util.Scanner;

public class Operator_Modulus {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = scan.nextInt();

//        System.out.println(num%2);

            if (num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }

}
