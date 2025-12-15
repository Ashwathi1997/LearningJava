package ex_11_While;

import java.util.Scanner;

public class Lab118_While_IQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial program");
        int n;
        if (!sc.hasNextInt()) {
            System.out.println("Enter integer only");
        } else {
            n = sc.nextInt();

            int fact = 1;
            if (n == 0) {
                fact = 1;
            }
            int i = n;
            if (n < 0 || n > Integer.MAX_VALUE) {
                System.out.println("Cannot execute as it is out of bound");
            } else {
                while (i >= 1) {
                    fact = fact * i;
                    i--;
                }
            }
            System.out.println(fact);
        }
    }
}
