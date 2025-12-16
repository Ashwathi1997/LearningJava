package ex_19_OOPs_Inheritance.SingleInheritance;

public class Lab184_Main {
    public static void main(String[] args) {
        Lab184_Son akhil = new Lab184_Son();
        System.out.println(akhil.gold_f); //from father
        akhil.bhk2(); // from father
        akhil.bhk3(); //from son itself

        Lab184_Father mohan = new Lab184_Father();
        System.out.println(mohan.gold_f); //from father itself
        mohan.bhk2(); // from father itself
        //mohan.bhk3(); cannot call from son
    }
}
