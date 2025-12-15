package ex_14_Strings;

public class Lab145_StringExamples1 {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "abc".compareTo("ABC"); // if abc then 0 if ABC then 32 i.e the diff between ASCII
        System.out.println(result);

        int idx = "Java".indexOf("a"); //1
        System.out.println(idx);

        int indx2 = "Java".lastIndexOf("a");
        System.out.println(indx2); //3

        boolean c1 = "".isEmpty(); // true
        System.out.println(c1);

        String s11 = String.join("-", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace("a", "o");
        System.out.println(s12); //Jovo

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);

        String s13 = "Java".concat("Mava");
        System.out.println(s13);
    }
}
