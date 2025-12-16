package ex_02_Java_Practise_Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab014_Count_Vowels_Consonants {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string to check which letter are vowels and which are consonants:");
        String input = br.readLine().trim();
        int vowel_counter = 0;
        int consonant_counter = 0;
        char a;

        for (int i = 0; i < input.length(); i++)
        {
            a = input.charAt(i);
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
            {
                System.out.println(a + " is a vowel");
                vowel_counter++;
            }
            else if ((a=='A' || a=='E' || a=='I' || a=='O' || a=='U'))
            {
                System.out.println(a + " is a vowel");
                vowel_counter++;
            }
            else if (!Character.isLetter(a))
            {
                System.out.println(a + " is neither a vowel nor consonant");
            }
            else
            {
                System.out.println(a + " is a consonant");
                consonant_counter++;
            }

        }
        System.out.println("Count of vowel is "+vowel_counter);
        System.out.println("Count of consonant is "+consonant_counter);

        /*for (int i = 0; i < input.length(); i++)
        {
            a = input.charAt(i);
            switch(a)
            {
                case 'a':
                    System.out.println(a+ " is a vowel");
                    continue;
                case 'e':
                    System.out.println(a+ " is a vowel");
                    continue;
                case 'i':
                    System.out.println(a+ " is a vowel");
                    continue;
                case 'o':
                    System.out.println(a+ " is a vowel");
                    continue;
                case 'u':
                    System.out.println(a+ " is a vowel");
                    continue;
                default:
                    System.out.println(a+" is a consonant");
                    continue;

            }


        }*/



    }
}
