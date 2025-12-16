package ex_02_Java_Practise_Tasks;

public class Lab011_Second_Highest_Number_In_array {
    public static void main(String[] args) {
        int[] n = {41,23,56,89,5,54,67,66,92,11,20,3,48,32};

        int highest = 0, second_highest=0;

        for (int num : n) {

            if(num>highest)
            {
                second_highest=highest;
                highest=num;
            }

        }
        System.out.println("Second Highest:"+second_highest);
        System.out.println("Highest:"+highest);

    }
}
