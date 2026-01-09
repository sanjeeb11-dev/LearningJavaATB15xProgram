package For_Loop;

import java.util.Scanner;

public class Continue {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Enter a No.");
            if (!scan.hasNextInt()) {
                System.out.println("Enter integer type");
                scan.next();
                continue;
            }
            int num = scan.nextInt();
            for (int i = 0; i < num; i++) {
                if (i == 5) {
                    continue;
                }
                System.out.println(i);
            }
            break;
        }
    }
}

