package ex_08_If_Condition;

public class Lab077_If_P1 {
    public static void main(String[] args) {

        String user_input = args[0];
        int age = Integer.parseInt(user_input);
        if (age > 25) {
            System.out.println("Can go to Goa");
        } else {
            System.out.println("Cannot go to Goa");
        }
    }
}
