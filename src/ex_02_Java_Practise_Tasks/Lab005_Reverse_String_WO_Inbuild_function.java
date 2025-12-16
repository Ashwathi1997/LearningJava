package ex_02_Java_Practise_Tasks;

import java.util.Scanner;

public class Lab005_Reverse_String_WO_Inbuild_function {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string to reverse it :");
        String input = sc.next();
        String reverse_input = "";
        String reverse_input1 = "";

        for (int i = input.length()-1; i >=0 ; i--) {

            reverse_input = reverse_input + input.charAt(i);
        }
        System.out.println(reverse_input);

        //else this is also possible

        char[] input_c = input.toCharArray();

        for (int i = input_c.length-1; i >=0 ; i--) {

            reverse_input1 = reverse_input1 + input_c[i] ;
        }
        System.out.println(reverse_input1);
    }
}
