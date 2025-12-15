package ex_10_For_Loop;

import java.util.Scanner;

public class Lab111_Calculate_Factorial_IQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number");
        int n = sc.nextInt();

        int fact = 1;
        if (n == 0) {
            fact = 1; // edge case
        }
        //for (int i = 1; i <=n ; i++) -> both works
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
}
