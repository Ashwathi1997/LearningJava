package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab35_CodingC10_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        double first = sc.nextDouble();
        System.out.println("Enter 2nd number:");
        double second = sc.nextDouble();
        System.out.println("Enter the operator to calculate the result:( + , - , * , /)");
        char op = sc.next().charAt(0);

        switch(op)
        {
            case '+':
            {
                System.out.println("Result: "+ (first+second));
                break;
            }
            case '-':
            {
                System.out.println("Result: "+ (first-second));
                break;
            }
            case '*':
            {
                System.out.println("Result: "+ (first*second));
                break;
            }
            case '/':
            {
                if(second==0)
                {
                    System.out.println("Error: Division by zero is not possible");
                    break;
                }
                else
                {
                    System.out.println("Result: "+ (first/second));
                    break;
                }

            }
            default:
            {
                System.out.println("Invalid operator");
            }

        }
    }
}
