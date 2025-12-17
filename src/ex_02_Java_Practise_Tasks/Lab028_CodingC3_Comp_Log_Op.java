package ex_02_Java_Practise_Tasks;

public class Lab028_CodingC3_Comp_Log_Op {
    public static void main(String[] args) {
        int a = 10, b = 5;

        boolean result = (a==b);
        System.out.print(" a == b: "+result);

        boolean result1 = (a > b) ;
            System.out.print(" a > b: "+ result1);

        boolean result2 = (a < b);
        System.out.print(" a < b: "+result2);

        boolean result3 = ((a > b) && (a > 0));
        System.out.print(" (a > b) && (a > 0): "+result3);

        boolean result4 = ((a < b) || (a > 0));
        System.out.print(" (a < b) || (a > 0): "+result4);


        boolean result5 = (!(a > b));
            System.out.print(" !(a > b): "+result5);


    }
}
