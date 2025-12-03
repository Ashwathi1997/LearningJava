package ex03_Literals;

public class Lab026_Final_Example {
    public static void main(String[] args) {
        int local;
        local = 10; //always needs to initialize to use it.
        System.out.println(local);

        final int f_a = 10;
        //f_a =11; //cannot update
        System.out.println(f_a);
    }
}
