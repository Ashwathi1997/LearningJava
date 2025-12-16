package ex_18_OOPs_Constructor;

public class Lab178_OOPs {
    public static void main(String[] args) {


        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;
        //System.out.println(b2.name); cannot be called as not initialized
    }
}

class Baby{

    String name; //instance variable

    Baby()
    {
        System.out.println("I am called, Object  is created");
    }
}
