package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // Create a function of sub, sum, mul, div
        // with parameter a and b (take the parameter from the user)

        //Logic Building
        //Step 1 => Inputs and Outputs
        //Step 2 => Rough Logic ( Create Functions)
        //Step 3 => Edge case coverage

        Scanner sc = new Scanner(System.in);
        int a = readInt(sc, "Enter first number");
        int b = readInt(sc, "Enter second number");

        int add_result = add(10,20);
        int sub_result = sub(10,20);
        int mul_result = mul(10,20);
        int div_result = div(10,20);
        int mod_result = mod(10,20);

        System.out.println("Result of addition: "+add_result);
        System.out.println("Result of subtraction: "+sub_result);
        System.out.println("Result of multiplication: "+mul_result);
        System.out.println("Result of division: "+div_result);
        System.out.println("Result of modulus: "+mod_result);

    }
    static int readInt(Scanner sc, String prompt)
    {
        System.out.println(prompt);
        if(sc.hasNextInt())
        {
            return sc.nextInt();
        }
        else
        {
            System.out.println("Enter the integer only.");
            System.exit(0);
            return 0;
        }
    }
    static int add(int a, int  b)
    {
        return a+b;
    }

    static int sub(int a, int  b)
    {
        return a-b;
    }

    static int mul(int a, int  b)
    {
        return a*b;
    }

    static int div(int a, int  b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }

    static int mod(int a, int  b)
    {
        return a%b;
    }
}
