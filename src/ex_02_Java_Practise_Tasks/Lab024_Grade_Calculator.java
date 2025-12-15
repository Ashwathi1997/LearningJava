package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab024_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage earned by the student: ");
        float percent = sc.nextFloat();

        if (percent > 90.0) {
            System.out.println("A");
        }

        else if (percent<=90.0 && percent>80.0) {
            System.out.println("B");
        }

        else if (percent<=80.0 && percent>70.0) {
            System.out.println("C");
        }

        else if (percent<=70.0 && percent>60.0) {
            System.out.println("D");
        }

        else {
            System.out.println("F");
        }

    }

}
