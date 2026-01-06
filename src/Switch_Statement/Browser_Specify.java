package Switch_Statement;

// Web Automation
// I will ask the user to give me the input from browser which he wants to
// use to I will start the automation in that browser.

import java.util.Scanner;

public class Browser_Specify {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Browser : ");
        String Browser = scan.next();
        Browser = Browser.toLowerCase();

        switch (Browser){
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
            default:
                System.out.println("Enter valid Browser");
        }
         scan.close();
    }
}
