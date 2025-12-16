package ex_16_Arrays;

public class Lab162_Sum_Of_Array {
    public static void main(String[] args) {
        int[] numbers = {56,42,38};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of the array is "+sum);
    }
}
