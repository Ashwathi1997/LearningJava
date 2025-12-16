package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab009_Pattern_Reverse_Right_Angle_Triangle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for n element to see a reverse right angle triangle:");
        int n = sc.nextInt();

        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}
