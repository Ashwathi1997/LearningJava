package ex_02_Java_Practise_Tasks;

public class Lab002_Even_Odd_Ternary_Op {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        String result = a % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);
        String result1 = b % 2 == 0 ? "Even" : "Odd";
        System.out.println(result1);
    }
}