package ex_07_Increment_Decrement;

public class Lab071_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);//22
        System.out.println(a); //12

        //a++ => 10
        //++a => 12
    }
}
