import java.util.Scanner;

public class HJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        while (str.length() > 8) {
            System.out.println(str.substring(0, 8));
            str = str.substring(8);
        }
        if (str.length() < 8 && str.length() > 0) {
            str += "0000000";
            System.out.println(str.substring(0, 8));
        }
    }
}