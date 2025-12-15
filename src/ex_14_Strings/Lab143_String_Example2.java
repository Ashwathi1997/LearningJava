package ex_14_Strings;

public class Lab143_String_Example2 {
    public static void main(String[] args) {
        CharSequence s = "Ashwathi".subSequence(1, 4);
        //sequence starts from 0
        //1 meaning s
        //4 is always n-1 so output is shw

        System.out.println(s); //

        String s1 = "Ashwathi";
        String s2 = s1.substring(2, 6); //hwath

        System.out.println(s1); //


    }
}
