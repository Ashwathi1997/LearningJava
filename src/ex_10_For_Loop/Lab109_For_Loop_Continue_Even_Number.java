package ex_10_For_Loop;

public class Lab109_For_Loop_Continue_Even_Number {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i); // Only Odd number will get printed
        }
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i); //Only Even number will get printed
        }
    }
}
