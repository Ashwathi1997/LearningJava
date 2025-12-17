package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab36_CodingC11_PrintNo_UsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n to run for loop:");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++)
        {
            System.out.print(i+" ");
        }
    }
}
