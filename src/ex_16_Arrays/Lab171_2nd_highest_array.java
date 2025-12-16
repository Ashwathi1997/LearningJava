package ex_16_Arrays;

public class Lab171_2nd_highest_array {
    public static void main(String[] args) {
    int[] numbers = {12,45,67,23,89,45,93};

    int highest = 0;
    int second_highest = 0;

        for (int num : numbers) {
            if(num>highest)
            {
                second_highest=highest;
                highest=num;
            }
            else if(num>second_highest && num!=highest)
            {
                second_highest=num;
            }
        }
        System.out.println("Highest:"+highest);
        System.out.println("Second Highest:"+second_highest);



    }
}
