package ex_09_Switch;

public class Lab092_Interview {
    public static void main(String[] args) {
        int a = 11;
// -1 will be compare with -1 only
        switch(-1) {
            case -1:
                System.out.println("10");
                break;

            case 1:
                System.out.println("11");
                break;

            default:
                System.out.println("Default");
        }
    }
}
