package ex_18_OOPs_Constructor;

public class Lab179_OOPs_Con {
    public static void main(String[] args) {

        A a1 = new A();
        System.out.println(a1);
    }
}

class A {

    A()
    {
        System.out.println("To read csv file, " +
                "open page before loading the script" +
                "you can do whatever you want");
    }
}
