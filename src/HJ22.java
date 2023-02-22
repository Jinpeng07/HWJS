import java.util.Scanner;

public class HJ22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                continue;
            }
            if (n == 1) {
                System.out.println(0);
            }
            int emptyBottle = n;
            int total = 0;
            while (emptyBottle >= 2) {
                if (emptyBottle % 3 == 2) {
                    int temp = emptyBottle;
                    emptyBottle= temp/3;
                    total += temp/3+1;
//                    emptyBottle =total;
                    continue;
                }
                if (emptyBottle % 3 == 1) {
                    int temp = emptyBottle;
                    emptyBottle = temp / 3 + 1;
                    total += temp / 3;
//                    emptyBottle = total + 1;
                    continue;
                }
                if (emptyBottle % 3 == 0) {
                    int temp = emptyBottle;
                    emptyBottle= temp / 3;
                    total += temp / 3;
//                    emptyBottle = total;
                    continue;
                }
            }
            System.out.println(total);
        }
    }
}
