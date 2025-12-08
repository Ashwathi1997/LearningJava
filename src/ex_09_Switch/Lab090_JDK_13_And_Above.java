package ex_09_Switch;

public class Lab090_JDK_13_And_Above {
    public static void main(String[] args) {
        int itemCode = 0;
        switch (itemCode) // without break statement
    {
        case 0 -> System.out.println("000");
        case 1 -> System.out.println("001");
        case 2 -> System.out.println("002");
        case 3 -> System.out.println("003");
        default -> System.out.println("Default");


    }
    }
}
