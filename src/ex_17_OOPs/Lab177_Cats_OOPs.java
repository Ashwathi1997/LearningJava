package ex_17_OOPs;

public class Lab177_Cats_OOPs {
    public static void main(String[] args) {
        Cat c1;
        Cat c2;
        Cat c3 = new Cat();
        Cat c4 = new Cat("Lucy");
        Cat c5 = new Cat("Pig");
        new Cat();

        //System.out.println(c1.name); //cannot as it is not initialized
        System.out.println(c3.name);
        System.out.println(c4.name);
        System.out.println(c5.name);

        c5.running();
    }
}

class Cat{

    String name;        //Instance variable

    Cat()
    {
        name = "Kitty";
    }

    Cat(String nameParam)
    {
        //c4.name = nameParam; this is what the below syntax means
        this.name = nameParam; // it is reference to current object
    }

    void running(){
        int local_var =0;   //Local variable
        System.out.println(this.name+" is running");
    }
    void annoying(){}
}
