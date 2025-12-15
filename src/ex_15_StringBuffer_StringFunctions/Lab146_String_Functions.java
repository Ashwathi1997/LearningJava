package ex_15_StringBuffer_StringFunctions;

public class Lab146_String_Functions {
    public static void main(String[] args) {
        String name = "Ashwathi";

        //length
        System.out.println(name.length());

        //charAt
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(10)); it doesnt exist

        //concat
        System.out.println(name.concat("Mohanan"));

        //contains
        System.out.println(name.contains("sh")); // boolean response

        //equals
        System.out.println(name.equals("Ashwathi"));

        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("ashwathi"));

        //indexOf
        System.out.println(name.indexOf('i')); //

        //replace
        System.out.println(name.replace("i","y"));

        //subString
        System.out.println(name.substring(2,8));

        //toLowerCase
        System.out.println(name.toLowerCase());

        //toUpperCase
        System.out.println(name.toUpperCase());

        //startsWith
        System.out.println(name.startsWith("A"));

        //endsWith
        System.out.println(name.endsWith("y"));

        //trim
        System.out.println(name.trim());

        //compareTo
        System.out.println(name.compareTo("ashwathi"));

        //join
        System.out.println(String.join(" ",name,"Mohanan"));

        //--------------
        StringBuilder sB = new StringBuilder("Ashwathi");
        System.out.println(sB);

        sB.reverse(); //Its mutable in nature so 1st variable and string gets updated
        System.out.println(sB); //and only one value exist in the Heap Area

        StringBuilder sb1 = new StringBuilder("Ashwathi");
        System.out.println(sb1.toString());






    }
}
