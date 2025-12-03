package ex_02_Java_Practise_Tasks;

public class Lab003_Nested_Ternary {
    public static void main(String[] args) {

        //Max / greater number in 3 set
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int result = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3) ;
        int result1 = n3 > n2 ? (n3 > n1 ? n3 : n1) : (n2 > n1 ? n2 : n1);
        System.out.printf("Max is %d%n",result);
        System.out.printf("Max is %d",result1);
    }
}
