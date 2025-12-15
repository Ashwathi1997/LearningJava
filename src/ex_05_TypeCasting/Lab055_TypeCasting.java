package ex_05_TypeCasting;

public class Lab055_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // implicit casting - automatic widening
        int a1 = (int) b; //explicit casting - deliberately widening - not required
    }
}
