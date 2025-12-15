package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab119_While_Guessing_Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        //System.out.println("Number to guess : "+numberToGuess);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess number:");
        int guess;
        int attempts = 0;

        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid Input ! Please enter a number.");
                sc.next(); // consume invalid token
                continue;
            }

            guess = sc.nextInt();     // guess gets captured
            attempts++;       // attempt gets counted

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }

            if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            } else if (guess < numberToGuess) {
                System.out.println("Too low, try again");
            } else {
                System.out.printf("You guessed it right in attempt %d. The number is %d", attempts, guess);
                break;
            }

        }
    }
}
