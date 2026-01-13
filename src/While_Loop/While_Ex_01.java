package While_Loop;

import java.util.Scanner;

public class While_Ex_01 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (;;) {

            System.out.println("Enter a Number :");
            if (!scan.hasNextInt()) {
                System.out.println("Enter a integer No. Only ");
                scan.next();
                continue;
            }
            int i = 0;
            int $_ = scan.nextInt();
            while (i <= $_) {
                System.out.println(i);
                i++;
//                continue;
            }
            break;
        }
    }
}



