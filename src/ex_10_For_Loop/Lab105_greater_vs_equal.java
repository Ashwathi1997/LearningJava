package ex_10_For_Loop;

public class Lab105_greater_vs_equal {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i); // 0 to 10, 11 times execute
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // 1 to 10, 10 times
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i); // 0 to 9, 10 times
        }
    }
}
