package ex_16_Arrays;

import java.util.Scanner;

public class Lab169_2D_Reverse_Right_Triangle {
    public static void main(String[] args) {
        //Reverse right triangle pattern
//        *****
//        ****
//        ***
//        **
//        *


        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number for the pattern : ");
        n = sc.nextInt();


        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
