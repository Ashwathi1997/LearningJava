package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab008_Pattern_Right_Angle_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for n element to see a right angle triangle:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
