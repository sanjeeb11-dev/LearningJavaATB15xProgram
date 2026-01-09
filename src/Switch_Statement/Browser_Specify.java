package Switch_Statement;

// Web Automation
// I will ask the user to give me the input from browser which he wants to
// use to I will start the automation in that browser.

import java.util.Scanner;

public class Browser_Specify {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a Browser : ");

            if (scan.hasNextInt()) {
                System.out.println("Enter only string value");
                scan.next();
                continue;
            }

            String Browser = scan.next();
            Browser = Browser.toLowerCase();

            if (!Browser.equals("chrome") && !Browser.equals("edge") && !Browser.equals("firefox")) {
                System.out.println("Enter valid Browser");
                continue;
            }

            switch (Browser) {
                case "chrome":
                    System.out.println("Starting the chrome");
                    System.out.println("Landing Login Page");
                    System.out.println("Enter user id");
                    System.out.println("Enter Password");
                    break;
                case "edge":
                    System.out.println("Starting with edge");
                    System.out.println("Redirect to login page");
                    break;
                case "firefox":
                    System.out.println("Staring with Firefox");
                    break;
//            default:
//                System.out.println("Enter valid Browser");
            }
            break;
        }
        scan.close();
    }
}
