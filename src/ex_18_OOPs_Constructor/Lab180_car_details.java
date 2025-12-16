package ex_18_OOPs_Constructor;

public class Lab180_car_details {
    public static void main(String[] args) {
        Lab180_Car car = new Lab180_Car();
        System.out.println(car.name);
        System.out.println(car.year);
        System.out.println(car.model);

        Lab181_LoginPage login = new Lab181_LoginPage();

        Lab182_Car2 car2 = new Lab182_Car2("maruti","KKK",2000);
        Lab182_Car2 car3 = new Lab182_Car2("innova");
    }
}
