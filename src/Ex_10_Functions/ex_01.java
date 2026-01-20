package Ex_10_Functions;

import java.util.Scanner;

public class ex_01 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = sum_of_two_numbers(a,b);
        System.out.println("sum of two numbers is ="+sum);
    }
    static int sum_of_two_numbers(int x, int y){
        return x+y;
    }
    static void sum_of_two_numbers(){
        System.out.println("Hi, there");
    }
}
