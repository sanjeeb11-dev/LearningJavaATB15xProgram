package Ex_06_Switch_Statement;

import java.util.Scanner;

public class Day_Week {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        while (true)
        for(;;){

            System.out.println("Enter the number 1 to 7 of the day in a week : ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input");
                scanner.next();
                continue;
            }

                int day = scanner.nextInt();

            if (day<1 || day>7) {
                System.out.println("Enter number of the day is not Valid");
                continue;
            }
//            System.out.println(day); {
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
//            }
            break;
        }
        scanner.close();
    }
}
