package ex_05_TypeCasting;

public class Lab057_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 8828178899l;
        //short phone_no1 = phone_no; // not possible for implicit casting;
        short phone_no2 = (short) phone_no; // explicit casting for narrowing
        System.out.println(phone_no2);
    }
}
