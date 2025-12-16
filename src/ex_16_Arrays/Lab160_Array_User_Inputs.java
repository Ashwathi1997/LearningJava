package ex_16_Arrays;

import java.util.Scanner;

public class Lab160_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        String[] number_marks = new String[size];

        //To accept the inputs from user
        for (int i =0; i<number_marks.length; i++)
        {
            System.out.println("Enter the element no."+i);
            number_marks[i] = sc.next();
        }

        //to print values
        System.out.println("Print the value");

        for (int i =0; i<number_marks.length; i++)
        {
            System.out.println(number_marks[i]);
        }

    }
}
