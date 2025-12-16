package ex_02_Java_Practise_Tasks;

import java.util.Random;
import java.util.Scanner;

public class Lab018_Practise {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int input;
        System.out.println("Guess the number: ");

        while(true)
        {
            if (!sc.hasNextInt()) {
                System.out.println("Enter valid input. Try again");
                sc.next();
                counter++;
            }

            else {
                input = sc.nextInt();
                if (input < 0 || input > 100) {
                    System.out.println("Enter valid input between 0 to 100. Try again");
                    //sc.next();
                    counter++;
                    continue;
                }
                else{
                    if(input > numberToGuess)
                    {
                        System.out.println("Too high, try again !");
                        counter++;
                        continue;
                    }
                    else if(input<numberToGuess)
                    {
                        System.out.println("Too low, try again !");
                        counter++;
                        continue;
                    }
                    else
                    {
                        System.out.println("You guessed it right in "+counter+" attempts");
                        break;
                    }

                }
            }
        }

    };

}
