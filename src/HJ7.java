import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        int n = (int) d;
        if (d - n >= 0.5) {
            System.out.println(n + 1);
        }else {
            System.out.println(n);
        }
    }
}
