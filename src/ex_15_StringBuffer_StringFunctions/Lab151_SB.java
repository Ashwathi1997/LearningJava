package ex_15_StringBuffer_StringFunctions;

public class Lab151_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java");
        stringBuffer.append(" Programming");
        System.out.println(stringBuffer);

        stringBuffer.replace(0,4,"c++");
        System.out.println(stringBuffer);

    }
}
