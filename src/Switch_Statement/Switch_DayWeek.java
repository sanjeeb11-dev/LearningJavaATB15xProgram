package Switch_Statement;

import java.util.Scanner;

public class Switch_DayWeek {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

        System.out.println("Enter the day: ");

            if (!sc.hasNextInt()) {
                System.out.println("Number should be integer");
                sc.next();
                continue;
            }

            int day = sc.nextInt();

            if (day < 1 || day > 7) {
                System.out.println("Give a Valid Input");
                continue;
            } else {
//            System.out.println(day); {
                switch (day) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                }
            }
        break;
        }
        sc.close();
    }
}
