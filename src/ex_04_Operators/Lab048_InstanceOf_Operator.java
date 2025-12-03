package ex_04_Operators;

public class Lab048_InstanceOf_Operator {
    public static void main(String[] args) {
        String s1 = new String("Ashwathi");
        int a = 10;

        //s1 is child of String
        //instanceof is used form non primitive type
        System.out.println(s1 instanceof String); // true

    }
}
