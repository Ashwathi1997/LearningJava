package ex_02_Java_Practise_Tasks;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab025_Reverse_No_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Enter a number.");
        }
        else
        {
            int input = sc.nextInt();
            if(input<=9)
            {
                System.out.println("Enter a number with more than 1 digit");
            }
            else
            {
                int reversed_number=0;
                Array reversed_array ;
                Array[] number = new Array[input];
                int j = number.length-1;
                for (int i = 0; i < number.length-1 ; i++) {

                   // reversed_array[i] = number[j];
                    j--;
                }
                //System.out.println(reversed_array);
            }

        }
    }
}
