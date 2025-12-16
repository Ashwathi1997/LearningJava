package ex_18_OOPs_Constructor;

public class Lab182_Car2
{

    String name;
    String model;
    int year;

    Lab182_Car2(){
        name = "ABC";
        model = "XXX";
        year = 1990;
    }

    Lab182_Car2(String carName, String modelName, int carYear){
        this("i10"); // calling the below constructor
        // constructor chaining concept

        this.name = carName;
        this.model = modelName;
        this.year = carYear;

    }

    Lab182_Car2(String carName){


        this.name = carName;


    }

    //This concept is call as
    // constructor overloading - same name diff parameter
}
