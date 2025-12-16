package ex_17_OOPs;

public class Lab176_Constructor {

    Student stud = new Student();
    Student stud1 = new Student("Ashwathi");
}
class Student
{   //it is local
    String name; //Attributes

    Student()               //default constructor
    {
        System.out.println("Hi, I am called");
    }

    Student(String name)    //parameterized constructor
    {
        System.out.println("Hi, I am "+name);
    }

    //Functionalities
    void sleep(){}
    void study(){}
    void eat(){}
}
