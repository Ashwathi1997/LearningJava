package ex_02_Java_Practise_Tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab006_Count_No_Of_Words_InString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to get the count of words:");
        String input = sc.next();
        String input1[] ={};
        for (int i = 0; i < input.length()-1; i++) {



            input1[i] = String.valueOf(input.charAt(i));

        }
        /*System.out.println(input1[0]);
        System.out.println(input1[1]);*/







    }
}
