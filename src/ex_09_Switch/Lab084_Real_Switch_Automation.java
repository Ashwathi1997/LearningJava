package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch (browser) {
            case "edge":
                System.out.println("Starting Edge");
                //..running the code within this
                break;

            case "chrome":
                System.out.println("Starting Chrome");
                //..running the code within this
                break;

            case "firefox":
                System.out.println("Starting in Firefox");
                //..running the code within this
                break;

            default:
                System.out.println("Browser not supported");

        }
    }
}
