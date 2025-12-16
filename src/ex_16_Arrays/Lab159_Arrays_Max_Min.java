package ex_16_Arrays;

import java.util.Arrays;

public class Lab159_Arrays_Max_Min {
    public static void main(String[] args) {

        //Find the min and max value in an array

        int arr[] = {23,55,89,32,4,67,39,50,92,5,72};

//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]); //shortest way

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
            {
                max = arr[i]; // replace the value of the max
            }

        }
        System.out.println("Maximum value is "+max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min = arr[i];
            }

        }
        System.out.println("Minimum value is " +min);

    }
}
