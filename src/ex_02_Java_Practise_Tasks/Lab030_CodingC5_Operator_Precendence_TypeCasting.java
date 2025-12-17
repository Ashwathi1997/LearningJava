package ex_02_Java_Practise_Tasks;

public class Lab030_CodingC5_Operator_Precendence_TypeCasting {
    public static void main(String[] args) {

        int i =  10;
        float f = 3.5f;

        float result = Math.round(i * f - i / (f + i) % f);
        float result1 = i + f;

        double impli = result1; // moving to a bigger container, this is implicit
        int expli = (int) result1; //moving to a different container, this is explicit


        System.out.print("Expression result: "+ result);
        System.out.print(" Implicit casting: "+impli);
        System.out.print(" Explicit casting: "+expli);

    }
}
