package ex_13_Functions;

public class Lab125_Simple_Method {
    public static void main(String[] args) {
        non_return_type_function(); //calling of non-return type function

        String name = return_string_type_function(); // calling of return type function
        System.out.println(name);
    }
    static void non_return_type_function(){
        System.out.println("Hi, there, no return function!");
    }

    //return type - which return a data type (int, String, char, boolean, float)
    static String return_string_type_function(){
        System.out.println("Hi, there , i will return something");
        return "ashwathi";
    }

    static boolean return_boolean()
    {
        return true;
    }
    static float return_float()
    {
        return 3.14f;
    }
    static byte return_byte()
    {
        return 100;
    }
    static long return_long()
    {
        return 123456789l;
    }

}
