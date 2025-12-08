package ex_09_Switch;

import java.util.Scanner;

public class Lab082_Switch_without_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number within 1 to 7");

        if(sc.hasNextInt())
        {
            int day = sc.nextInt();
            switch(day)
            {
                case 1:
                    System.out.println("Sunday");// all the statement eill get executed
                case 2:
                    System.out.println("Monday");
                case 3:
                    System.out.println("Tuesday");
                case 4:
                    System.out.println("Wednesday");
                case 5:
                    System.out.println("Thursday");
                case 6:
                    System.out.println("Friday");
                case 7:
                    System.out.println("Saturday");
                default:
                    System.out.println("Please Enter Integer within 1 to 7");

            }
        }
        else {
            System.out.println("Enter Integer within 1 to 7");
        }
    }
}

