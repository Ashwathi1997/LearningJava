package ex_16_Arrays;

import java.util.Scanner;

public class Lab170_2D_Left_Triangle {
    public static void main(String[] args) {

        //Left triangle pattern
//          *
//         **
//        ***

        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number for the pattern : ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
