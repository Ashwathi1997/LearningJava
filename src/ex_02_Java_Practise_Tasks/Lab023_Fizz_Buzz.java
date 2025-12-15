package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab023_Fizz_Buzz {
    public static void main(String[] args) {
//        The FizzBuzz problem is a common coding challenge that requires
//        you to print numbers from 1 to 100 with the following rules:
//        For numbers divisible by 3, print "Fizz" instead of the number.
//        For numbers divisible by 5, print "Buzz" instead of the number.
//        For numbers divisible by both 3 and 5, print "FizzBuzz" instead of the number.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number to see the FizzBizz coding:");
//        int input = sc.nextInt();

        for (int i = 1; i <= 100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if (i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
