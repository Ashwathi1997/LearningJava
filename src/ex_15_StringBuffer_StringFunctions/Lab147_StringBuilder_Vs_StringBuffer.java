package ex_15_StringBuffer_StringFunctions;

public class Lab147_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {

        //90% times used
        String s0 = "Ashwathi";
        String s1 = new String("Ashwathi");

        //10% times used
        StringBuilder stringBuilder = new StringBuilder("Ashwathi");
        StringBuffer stringBuffer = new StringBuffer("Ashwathi");   //Thread safe

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuffer.reverse());
    }
}
