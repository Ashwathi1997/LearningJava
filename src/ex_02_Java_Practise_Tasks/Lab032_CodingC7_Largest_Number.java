package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab032_CodingC7_Largest_Number {
    public static void main(String[] args) {
        int num1, num2, num3, highest = 0;
        System.out.println("Enter 3 numbers to get the largest number amongst them:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number :");
        num2 = sc.nextInt();
        System.out.println("Enter 3rd number :");
        num3 = sc.nextInt();

        if(num1==num2 || num2==num3 || num1==num3)
        {
            if(num1==num2)
            {
                if(num2==num3)
                {
                    System.out.println("Largest number is: "+num1);
                }
                else if(num2>num3)
                {
                    System.out.println("Largest number is: "+num2);
                }
                else
                {
                    System.out.println("Largest number is: "+num3);
                }

            }
            else if(num2==num3)
            {
                if(num1==num3)
                {
                    System.out.println("Largest number is: "+num2);
                }
                else if(num1>num3)
                {
                    System.out.println("Largest number is: "+num1);
                }
                else
                {
                    System.out.println("Largest number is: "+num3);
                }

            }
            else if(num1==num3)
            {
                if(num2==num3)
                {
                    System.out.println("Largest number is: "+num1);
                }
                else if(num2>num3)
                {
                    System.out.println("Largest number is: "+num2);
                }
                else
                {
                    System.out.println("Largest number is: "+num3);
                }

            }

        }
        else if (num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("Largest number is: "+num1);
            }
            else
            {
                System.out.println("Largest number is: "+num3);
            }
        }
        else //num2>num1
        {
            if(num2>num3)
            {
                System.out.println("Largest number is: "+num2);
            }
            else
            {
                System.out.println("Largest number is: "+num3);
            }
        }


    }
}
