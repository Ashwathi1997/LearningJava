package ex_02_Java_Practise_Tasks;

public class Lab009_Doubt {
    public static void main(String[] args) {
        float temp = 98.4f;
        if(temp < 98.4) //included
        { System.out.println("SUMMER"); }
        else
        { System.out.println("UNKNOWN"); }

        if(temp > 98.4) // excluded
        { System.out.println("SUMMER"); }
        else
        { System.out.println("UNKNOWN"); }
    }}
