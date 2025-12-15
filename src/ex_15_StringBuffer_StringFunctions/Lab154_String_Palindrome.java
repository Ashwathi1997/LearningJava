package ex_15_StringBuffer_StringFunctions;

import java.util.Scanner;

public class Lab154_String_Palindrome {
    public static void main(String[] args) {

        //Write a palindrome program -> madam reverse madam

        String input = "Madam";
        String reverse_input = "";

        for (int i = input.length()-1; i >=0; i--)
        {
            reverse_input = reverse_input + input.charAt(i);
        }

        if(input.equalsIgnoreCase(reverse_input))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}
