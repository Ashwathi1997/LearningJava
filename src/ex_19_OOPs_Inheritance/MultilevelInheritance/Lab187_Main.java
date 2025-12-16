package ex_19_OOPs_Inheritance.MultilevelInheritance;

public class Lab187_Main {
    public static void main(String[] args) {
        Lab187_Son son = new Lab187_Son();
        son.home();
        son.bhk3();
        son.gf();
        son.extra();

        Lab187_Father father =  new Lab187_Father();
        father.extra();
        father.home();
        father.gf();

        Lab187_GrandFather grand_father = new Lab187_Father();
        grand_father.gf();
        grand_father.home();

        //Dynamic Dispatch
        Lab187_GrandFather g1 = new Lab187_Son();
        Lab187_Father f1 = new Lab187_Son();

        //Lab187_Son s1 = new Lab187_Father(); not possible
        //Lab187_Son s2 = new Lab187_GrandFather(); not possible
    }
}
