package ex_02_Java_Practise_Tasks;

public class Lab007_Array_through_for_loop {
    public static void main(String[] args) {

    int[][] arr = {
            {1,3,5},
            {7,9,11},
            {13,15,17},
            {19,21,23}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +"   |   ");
            }
            System.out.println();

        }
    }

}
