package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab013_Fibonacci_Series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for fibonacci series value");
        int n = sc.nextInt();
        int first_temp = 0;
        int second_temp =1;
        int next_temp;

        for (int i = 1; i <= n; i++) {

            System.out.print(first_temp+" ");
            next_temp = first_temp+second_temp;
            first_temp = second_temp;
            second_temp = next_temp;
        }

    }
}
