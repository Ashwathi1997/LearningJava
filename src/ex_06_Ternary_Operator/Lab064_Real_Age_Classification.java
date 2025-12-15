package ex_06_Ternary_Operator;

public class Lab064_Real_Age_Classification {
    public static void main(String[] args) {
        String user_input = args[0]; // 68
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        //input - string
        //string to integer is required

        int age = Integer.parseInt(user_input); // typecasting is possible only for similar datatype
        String result = age < 18 ? "Minor" : (age > 60 ? "Sr. Citizen" : "Adult");
        System.out.printf("Age %d: %s%n", age, result);


    }

}
