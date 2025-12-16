package ex_02_Java_Practise_Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab012_Palindrome {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word to check if it is a Palindrome:");
        String input = br.readLine().trim();

        String reverse = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            reverse = reverse + input.charAt(i);
        }

        if(reverse.equals(input))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }


    }
}
