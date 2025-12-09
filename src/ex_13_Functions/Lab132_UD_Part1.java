package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
//        1. Without Parameters and Without Return Type
//        2. Without Parameters but With Return Type
//        3. With Parameters and Without Return Type
//        4. With Parameters and With Return Type.

        wop_wor_greet(); // 1st type calling

        String msg = wop_wr_greet2();   //2nd type calling
        System.out.println(msg);

        greet_with_details("Ashwathi",65, 10000);   // 3rd type calling
        greet_with_details("Akhil", 76,900000);

        int result1= sum_of_two_number(10,20);  // 4th type calling
        int result2= sum_of_two_number(40,70);
        float result3= sum_of_three_number(30.1f,50.5f,60.8f);
        float result4= sum_of_three_number(100,200,300);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
 //  1. Without Parameters and Without Return Type
     static void wop_wor_greet()
     {
         System.out.println("Hi, type 1 function!");
         System.out.println("Hi, there!");
     }
//   2. Without Parameters but With Return Type
    static String wop_wr_greet2(){
        System.out.println("Hi, Type 2 function!");
        return "Ashwathi";
    }
    //3. With Parameters and Without Return Type
       static  void greet_with_details(String name, int age, double salary){
           System.out.println("Your name is "+name+"\nYour age is "+age+"\n Salary is "+salary);
       }
    // 4. With Parameters and With Return Type.
        static int sum_of_two_number(int a, int b)
        {
            return a+b;
        }

    static float sum_of_three_number(float a, float b, float c)
    {
        return a+b+c;
    }
}
