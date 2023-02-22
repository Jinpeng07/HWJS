import java.util.Arrays;
import java.util.Scanner;
public class HJ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            String s = in.next();
            strArray[i] = s;
            System.out.println(strArray[i]);
        }
        Arrays.sort(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
