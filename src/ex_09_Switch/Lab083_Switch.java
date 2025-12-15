package ex_09_Switch;

import java.util.Scanner;

public class Lab083_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number within 1 to 7");

        if (sc.hasNextInt()) {
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Sunday"); // if another number is entered no input will be displayed
                    break;

                case 2:
                    System.out.println("Monday");
            }
        } else {
            System.out.println("Enter Integer within 1 to 7");
        }
    }
}


