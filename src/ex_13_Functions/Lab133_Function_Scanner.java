package ex_13_Functions;

import java.util.Scanner;

public class Lab133_Function_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first integer: ");
        a = sc.nextInt();

        System.out.println("Enter second integer: ");
        b = sc.nextInt();
        int result = sum_of_two_number1(a, b);
        System.out.println(result);
    }

    static int sum_of_two_number1(int a, int b) // with parameter
    {
        return a + b;
    }
}
