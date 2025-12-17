package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab37_CodingC12_Factorial_Calculator_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int fact = 1;
        System.out.println("Enter a number to calculate the factorial");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Enter a valid integer");
        }

            input = sc.nextInt();
            if(input==0)
            {
                System.out.println("Factorial of "+input+ " is: "+fact);
            }
            else {
                int i = input;
                while (i >= 1) {
                    fact = fact * i;
                    i--;
                }
                System.out.println("Factorial of "+input+ " is: "+fact);
            }


    }
}
