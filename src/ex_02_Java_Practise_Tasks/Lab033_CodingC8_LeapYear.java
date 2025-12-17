package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab033_CodingC8_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check if its leap year or not:");
        int year = sc.nextInt();

        if(year%4==0)
        {
            System.out.println(year+ " is a leap year");
        }
        else if(year%100==0 && year%400==0)
        {
            System.out.println(year+ " is a leap year");
        }
        else
        {
            System.out.println(year+ " is not a leap year");
        }
    }
}
