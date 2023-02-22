import java.util.Scanner;

public class HJ21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                System.out.print(c);
                continue;
            }
            if (Character.isUpperCase(c)) {
                if (c == 'Z') {
                    System.out.print('a');
                    continue;
                }
                c += 33;
                System.out.print(c);
                continue;
            }
            if (Character.isLowerCase(c)) {
//                int c = Character.valueOf(c);
                if (c >= 119) {
                    System.out.print(9);
                    continue;
                }
                if (c >= 116) {
                    System.out.print(8);
                    continue;
                }
                if (c >= 112) {
                    System.out.print(7);
                    continue;
                }
                if (c >= 109) {
                    System.out.print(6);
                    continue;
                }
                if (c >= 106) {
                    System.out.print(5);
                    continue;
                }if (c >= 103) {
                    System.out.print(4);
                    continue;
                }
                if (c >= 100) {
                    System.out.print(3);
                    continue;
                }
                if (c >= 97) {
                    System.out.print(2);
                    continue;
                }
            }
        }
    }
}
