package ex_02_Java_Practise_Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab031_CodingC6_No_Classification {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is positive or negative: ");
        int input = sc.nextInt();

        if(input>0)
        {
            System.out.println(input+" is positive");
        }
        else if(input == 0)
        {
            System.out.println(input+" is zero");
        }
        else
        {
            System.out.println(input+" is negative");
        }
    }
}
