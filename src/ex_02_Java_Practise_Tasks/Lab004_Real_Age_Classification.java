package ex_02_Java_Practise_Tasks;

public class Lab004_Real_Age_Classification {
    public static void main(String[] args) {
        int age = 65;
        int age1 = 59;
        int age2 = 12;

        String result = age < 18 ? "Minor" : (age > 60 ? "Sr. Citizen" : "Adult");
        System.out.printf("Age %d: %s%n", age, result);

        String result1 = age1 < 18 ? "Minor" : (age1 > 60 ? "Sr. Citizen" : "Adult");
        System.out.printf("Age %d: %s%n", age1, result1);

        String result2 = age2 < 18 ? "Minor" : (age2 > 60 ? "Sr. Citizen" : "Adult");
        System.out.printf("Age %d: %s%n", age2, result2);

    }
}
