package ex_16_Arrays;

public class Lab158_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {91, 92, 93, 94, 95, 96, 97};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);

        //For loop to print
        for(int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }


        //Enhanced loops -> For each loop
        for(int mark : marks)
        {
            System.out.println(mark);
        }
    }
}
