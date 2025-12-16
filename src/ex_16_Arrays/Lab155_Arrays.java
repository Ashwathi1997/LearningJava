package ex_16_Arrays;

public class Lab155_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {91, 92, 93, 94, 95, 96, 97};
        boolean[] is_married = {true,false,true};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        // System.out.println(marks[-1]); ArrayIndexOutOfBoundsException

        String name = "ashwathi";
        String[] name_each_element = name.split("");
        for (String s :name_each_element)
        {
            System.out.println(s);
        }


    }
}
