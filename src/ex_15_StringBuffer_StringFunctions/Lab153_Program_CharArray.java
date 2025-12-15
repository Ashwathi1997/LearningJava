package ex_15_StringBuffer_StringFunctions;

import java.util.Scanner;

public class Lab153_Program_CharArray
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String to reverse it:");
        String input = sc.next();

        String reverse_input = "";

        char[] arr = input.toCharArray();


        for (int i = arr.length-1; i >=0 ; i--)
        {
            reverse_input = reverse_input + arr[i];
        }
        System.out.println(reverse_input);

    }
}
