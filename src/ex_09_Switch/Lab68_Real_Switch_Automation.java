package ex_09_Switch;

import java.util.Scanner;

public class Lab68_Real_Switch_Automation {
    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter the browser");

        String browser = scanner.next();

        switch (browser)
        {
            case "chrome":
                System.out.println("this is chrome bowser");
                break;
            case "safari":
                System.out.println("this is safari");
                break;
            case "edge":
                System.out.println("this is  edge");
                break;
            default:
                System.out.println("enter any browser");
                break;
        }
    }
}
