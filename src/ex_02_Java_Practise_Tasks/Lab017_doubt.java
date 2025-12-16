package ex_02_Java_Practise_Tasks;

public class Lab017_doubt {
    public static void main(String[] args) {
        int a2 = 3;
        if (a2 > 0) if (a2 > 2) if (a2 > 4) System.out.print("A");
        else System.out.print("B");
        else System.out.print("C");
        else System.out.print("D");


        //if(TRUE)            -> cannot have TRUE as a parameter directly
        System.out.println("GO");
        //else
        System.out.println("STOP");

        int a = 10;
        if (a == 9)
            System.out.println("OK ");
            //System.out.println("MASTER"); //cannot add this statement without {}
        else
            System.out.println("BYE");


        String name1 = "FOX", name2 = "DOG";
        if (name1 == "FOX")
            System.out.print("FOX ");
        System.out.println("GOOD");
        if (name2 == "CAT")
            System.out.println("DINO");



        int marks = 85;
        if (marks >= 80)
            System.out.println("DISTINCTION");
        else if (marks >= 35)
            System.out.println("PASS");



        float temp = 98.4f;
        if (temp < 98.4) //included
        {
            System.out.println("SUMMER");
        } else {
            System.out.println("UNKNOWN");
        }

        if (temp > 98.4) // excluded
        {
            System.out.println("SUMMER");
        } else {
            System.out.println("UNKNOWN");
        }

        int horses = 10;
        int camels = 5;
        if (horses < 5) {
            System.out.println("TOWN");
        } else if (horses >= 5)
            System.out.print("FOREST ");
        System.out.println("AMAZON");
        //else System.out.println("UNKNOWN"); // if this statement is added complie error will come


        int marks1 = 29;
        if (marks1 > 29) ;
        System.out.print("PASS ");
        System.out.println("RANK");



        if (true) { //break; //=> break statement will give compilation error
            System.out.println("ELEPHANT");
        }



        int x = 5;
        if (x > 3)
            if (x < 10)
                System.out.print("A");
            else System.out.print("B");



        boolean flag = false;
        if (flag = true)
            System.out.print("Yes");
        else System.out.print("No");


        int a1 = 0;
        // if(a1++) its not compatible type as its int , not boolean
        System.out.print("Hello");
        //else System.out.print("World");


        int a3 = 5, b3 = 2;
        if (a3 > 10)
            if (b3 > 1)
                System.out.print("A");
            else System.out.print("B");
        else System.out.print("C");

        int x1 = 3;
        if (x1 > 0)
            if (x1 > 5)
                System.out.print("Big");
            else System.out.print("Small");

        int a4 = 1;
        while (a4 < 4)
        {
            System.out.print(a4 + " ");
            a4++;
        }



    }
}
