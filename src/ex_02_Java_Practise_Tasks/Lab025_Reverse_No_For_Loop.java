package ex_02_Java_Practise_Tasks;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab025_Reverse_No_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Enter a number.");
        }
        else
        {
            int input = sc.nextInt();
            if(input<=9)
            {
                System.out.println("Enter a number with more than 1 digit");
            }
            else
            {
                int reverse = 0 ;
                int decimal = 0;


                {
                 decimal=input%10;
                input=input/10;
                reverse=reverse+decimal;
                }
                System.out.println(reverse);
            }


    // not complete yet
        }
    }
}
