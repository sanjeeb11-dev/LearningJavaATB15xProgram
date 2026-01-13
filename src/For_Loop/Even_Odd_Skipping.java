package For_Loop;

import java.util.Scanner;

public class Even_Odd_Skipping {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        while (true)
        for(;;) {

            System.out.println("Enter the No.");
            if (!scan.hasNextInt()) {
                System.out.println("Enter a valid Integer");
                scan.next();
                continue;
            }
            int num = scan.nextInt();
            if (num < 0) {
                System.out.println("Enter a positive number :");
                continue;
            } else {
                for (int i = 0; i <= num; i++) {
                    if (i % 2 == 0) {
                        continue;
                    }
                    System.out.println(i);
                }
                break;
            }
//            scan.close();
        }
    }
}
