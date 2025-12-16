package ex_02_Java_Practise_Tasks;

public class Lab010_Maximum_Miniumum_Number_In_array {
    public static void main(String[] args) {

        int[] n = {41,23,56,89,5,54,67,66,11,20,3,48,32};

        int max = 0 , min=10;

        for (int num : n) {
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("Maximum:" + max);
        for (int num : n) {
            if(num<min)
            {
                min=num;
            }
        }
        System.out.println("Minimum: "+min);


    }
}
