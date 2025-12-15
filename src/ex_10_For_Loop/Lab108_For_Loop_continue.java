package ex_10_For_Loop;

public class Lab108_For_Loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) // 0 to 49 - 50 times
        {
            if (i == 5) {
                continue;       // continue will skip the loop and continue the next round
            }
            System.out.println(i); // 0,1,2,3,4..
        }
    }
}
