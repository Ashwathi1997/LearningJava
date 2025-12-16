package ex_15_StringBuffer_StringFunctions;

public class Lab148_SBP {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Ashwathi");
        stringBuffer.append("Mohanan");
        System.out.println(stringBuffer); //AshwathiMohanan //Here only 1 value exists in Heap Area

        String s1  = "AshwathI";
        s1 = s1 + "Mohan";
        System.out.println(s1); //There will be 2 variables in the SCP

    }
}
