package ex_02_Java_Practise_Tasks;

public class Lab019_while_if {
    public static void main(String[] args) {
        int cnt = 0;
        while (true) {
            if (cnt > 4)
                break;
            if (cnt == 0) {
                cnt++;
                continue;
            }
            System.out.print(cnt + ",");
            cnt++;
        }
        int age = 20;
        do {
            age++;
        }
        while (age < 20);
        System.out.println(age);

        /*int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }
            while(j<4);
            i++;
        }*/
        for (int i = 1; i < 5; i++) {
            System.out.print(i + ",");
        }

        int score = 1;
        for (; true; score++) {
            System.out.print(score + ",");
            if (score > 3) break;
        }

        String countries[] = {"BRAZIL", "CHILE", "SYDNEY"};
        int i = 0;
        for (String str : countries) {
            if (i < 2) ;
            else break;
            System.out.print(str + ",");
            i++;
        }
    }
}
