package ex_04_Operators;

public class Lab038_Logical_Operator {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a); // false

        boolean b = true;
        System.out.println(!!b); // true

        boolean c = true || false; //or operator
        System.out.println(c);

        boolean c1 = false && true; // and operator
        System.out.println(c1);
    }
}
