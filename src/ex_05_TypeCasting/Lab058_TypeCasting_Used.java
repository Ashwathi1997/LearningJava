package ex_05_TypeCasting;

public class Lab058_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total1 = course+GST; //Narrowing - Implicit
        int total1 = course+(int)GST; // Narrowing - Explicit
        System.out.println(total1);

        float total2 = course+GST; // Windening - auto - Implicit
        //float is larger than integer so no explicit casting is required


    }
}
