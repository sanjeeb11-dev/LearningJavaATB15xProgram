package Ex_10_Functions;

import java.util.Scanner;

public class ex_03 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = readInt(scan, "Enter the num1");
        int b = readInt(scan, "Enter the num2");
//        int c = readInt(scanner, "Enter the num3");

//        if (scanner.hasNextInt()){
//            int c = scanner.hasNextInt();
//        } else {
//            System.out.println("Please enter the value of c as int");
//        }

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_mod = mod(a, b);
        int result_div = div(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_mod);
        System.out.println(result_div);
        scan.close();
    }

    static int readInt(Scanner scan, String prompt) {
        System.out.println(prompt);
        if (scan.hasNextInt()) {
            return scan.nextInt();
        } else {
            System.out.println("Enter the int only!");
                System.exit(0);
            return 0;
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by 0 is not possible.");
        }
        return a / b;
    }
}

