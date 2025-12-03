package ex_04_Operators;

public class Lab040_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        String f_n = "Ashwathi";
        String l_n = "Mohanan";
        System.out.println(f_n + l_n + a + b); // AshwathiMohanan1020
        System.out.println(a + b + f_n + l_n); // 30AshwathiMohanan
        System.out.println(f_n + l_n + (a + b)); //AshwathiMohanan30
    }
}
