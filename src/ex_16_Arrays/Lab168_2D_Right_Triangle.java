package ex_16_Arrays;

import java.util.Scanner;

public class Lab168_2D_Right_Triangle {
    public static void main(String[] args) {
        //Right Triangle
//        *
//        **
//        ***

        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number for the pattern : ");
        n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
                //System.out.print("\uD83D\uDE0A"); //for smiley UNICODE
            }
            System.out.println();

        }

    }
}
