package ex_10_For_Loop;

public class Lab107_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) // 0 to 49 - 50 times
        {
            System.out.println(i); // 0 - 5 will get printed
            if(i==5){
                break;
            }
            System.out.println(i); // 0 - 4 gets printed
        }
    }
}
