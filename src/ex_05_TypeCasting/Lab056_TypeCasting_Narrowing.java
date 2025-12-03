package ex_05_TypeCasting;

public class Lab056_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300; // 32 bits
        //byte b = val ; // Narrowing - implicit casting
        // not possible

        //below will take only 8 bits of it
        //there is loss of data
        byte b = (byte) val; // Narrowing - explicit casting - valid
        System.out.println(b); //44 is displayed , not 300


    }

}
