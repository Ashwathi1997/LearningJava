package ex_14_Strings;

public class Lab137_String_Immutable {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat("world");
        System.out.println(s1); //helloworld
        //2 strings are in SCP
    }
}
