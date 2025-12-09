package ex_02_Java_Practise_Tasks;

import java.util.Random;
import java.util.Scanner;

public class Lab022_Guessing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        int guess;
        int attempt = 0;
        System.out.println("Guess the number:");

        while(true)
        {
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Enter a number.");
            sc.next(); // consume the invalid token
            continue;
        }
            guess = sc.nextInt();
            attempt++;

            if(guess<1 || guess>100)
            {
                System.out.println("Enter a number within 0 - 100 range");
                continue;
            }


                    if(guess>numberToGuess)
                    {
                        System.out.println("Too high, try again !");
                        continue;

                    }
                    else if(guess<numberToGuess)
                    {
                        System.out.println("Too low, try again !");
                        continue;

                    }
                    else
                    {
                        System.out.printf("You guessed it right in %d attempts. Number was %d", attempt, numberToGuess);
                        break;
                    }

        }


    }
}
