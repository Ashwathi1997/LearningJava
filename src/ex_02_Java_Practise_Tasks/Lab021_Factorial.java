package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab021_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int fact = 1;
        System.out.println("Enter the number to calculate factorial:");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Enter a number");
        } else {
            input = sc.nextInt();

            if (input < 0 || input > 100) {
                System.out.println("Enter a valid number");
            } else if (input == 0) {
                System.out.printf("Factorial of %d is %d.", input, fact);
            } else {
                for (int i = input; i >= 1; i--) {
                    fact = fact * i;
                }
                System.out.printf("Factorial of %d is %d.", input, fact);
            }
        }

    }
}
