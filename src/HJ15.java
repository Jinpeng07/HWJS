import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
//        for (int i = 0; i < 32; i++) {
//            if ((n & 1) == 1) {
//                count++;
//            }
//            n = n >>> 1;
//        }
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
