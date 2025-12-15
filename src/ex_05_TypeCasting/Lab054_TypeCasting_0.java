package ex_05_TypeCasting;

public class Lab054_TypeCasting_0 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid syntax - implicit casting -> widening

        int c = 300;
        //byte d = c; not possible
        //type casting is a process of converting
        //a value fom one datatype to another

        a = (int) b; // explicit casting - widening
    }
}
