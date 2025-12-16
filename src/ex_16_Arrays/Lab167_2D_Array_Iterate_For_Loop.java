package ex_16_Arrays;

public class Lab167_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}}; //3*3

        for (int i = 0; i < matrix1.length; i++) //for row
        {
            for (int j = 0; j < matrix1[i].length; j++)  //for column of each row
            {
                System.out.print(matrix1[i][j]+ " | ");
            }

            System.out.println(); // it will give space after each row
        }

    }
}
