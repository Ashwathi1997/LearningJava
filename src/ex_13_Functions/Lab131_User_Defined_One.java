package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
        int result = sum_of_two_number();
        System.out.println(result);

        int result1 = sum_of_two_number1(40,50);
        System.out.println(result1);

        int result2 = sum_of_two_number1(35,65);
        System.out.println(result2);
    }
    static int sum_of_two_number() // without parameter
    {
        return 10+20;
    }

    static int sum_of_two_number1(int a, int b) // with parameter
    {
        return a+b;
    }

    static int sum_of_two_number(int a , int b) // same function name can be used
    {                                           // called as method overloading
        return a+b;
    }

}
