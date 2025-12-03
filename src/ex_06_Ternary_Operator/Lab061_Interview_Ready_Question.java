package ex_06_Ternary_Operator;

public class Lab061_Interview_Ready_Question {
    public static void main(String[] args) {
        int age = 21;

        //nested ternary operator
        //result = condition ? expression 1 : (condition2 ? expression 2 : expression 3)
        String result = (age > 18) ? (age >25 ? "You can drink" : "You can go but cant drink") : "No";
        System.out.println(result);

        //nested if else
    }
}
