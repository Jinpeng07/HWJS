import java.util.Scanner;

public class HJ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 2; i < Math.sqrt(num); i++) {
            while (num % i == 0) {
                System.out.print(i+" ");
                num /= i;
            }
        }
        if (num != 1) {
            System.out.print(num);
        }
    }
}
