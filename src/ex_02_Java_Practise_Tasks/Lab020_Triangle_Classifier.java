package ex_02_Java_Practise_Tasks;

import java.sql.Array;
import java.util.Scanner;

public class Lab020_Triangle_Classifier {
    public static void main(String[] args) {
        //n1 = n2 = n3 => Equilateral
        //n1 = n2 != n3 => Isoceles
        //n1 != n2 != n3 => Scalene

        /*int[] n = new int[3];
        Scanner sc = new Scanner(System.in);
        int j = 1;
        for(int i=0; i<3; i++) //to get the value of sides
        {
            System.out.println("Enter side " + j + " of the triangle");
            n[i] = sc.nextInt();
            System.out.println(n[i]);
            j++;
        }*/

        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 of the triangle");
        n1 = sc.nextInt();
        System.out.println("Enter side 2 of the triangle");
        n2 = sc.nextInt();
        System.out.println("Enter side 3 of the triangle");
        n3 = sc.nextInt();

        if(n1 == n2)
        {
            if(n2 == n3)
            {
                System.out.println("Triangle is Equilateral");
            }
            else
            {
                System.out.println("Triangle is Isoceles");
            }
        }
        else
        {
            if(n2 == n3)
            {
                System.out.println("Triangle is Isoceles");
            }
            else
            {
                System.out.println("Triangle is Scalene");
            }
        }






    }
}
