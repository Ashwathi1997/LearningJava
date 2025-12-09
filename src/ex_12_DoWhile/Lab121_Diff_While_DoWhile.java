package ex_12_DoWhile;

public class Lab121_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a =0;
        while(a<0)
        {
            System.out.println(a);  // wont run bcoz its doesnt meet the criteria
            a++;
        }

        do{
            System.out.println(a);  // will run bcoz it will run atleast once
            a++;
        }
        while(a<0);
    }
}
