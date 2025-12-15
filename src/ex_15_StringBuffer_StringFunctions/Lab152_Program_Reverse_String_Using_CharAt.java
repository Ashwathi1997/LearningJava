package ex_15_StringBuffer_StringFunctions;

import java.util.Scanner;

public class Lab152_Program_Reverse_String_Using_CharAt {
    public static void main(String[] args) {
        //Write a program to reverse a string without reverse function

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String to reverse it:");
        String input = sc.next();

//        StringBuilder stringBuilder = new StringBuilder(input);
//        stringBuilder.reverse();
//        System.out.println(stringBuilder); //easiest way

        String reverse_input = "";

        for (int i = input.length()-1; i >=0 ; i--)
        {
            reverse_input = reverse_input + input.charAt(i);
        }
        System.out.println(reverse_input);

    }
}
