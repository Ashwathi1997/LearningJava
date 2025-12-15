package ex_15_StringBuffer_StringFunctions;

public class Lab150_Sbuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");

        stringBuilder.append(" World");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
