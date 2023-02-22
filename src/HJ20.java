import java.util.Scanner;

public class HJ20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            if (s.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            if (!checkMatch(s)) {
                System.out.println("NG");
                continue;
            }
            if (!checkDuplicate(s, 0, 3)) {
                System.out.println("NG");
                continue;
            }
            System.out.printf("OK");
        }
    }

    public static boolean checkMatch(String s) {
        int a = 0, b = 0, c = 9, d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                a = 1;
            }
            if (Character.isLowerCase(s.charAt(i))) {
                b = 1;
            }
            if (Character.isDigit(s.charAt(i))) {
                c = 1;
            }
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                d = 1;
            }
        }
        return (a + b + c + d) >= 3 ? true : false;
    }

    public static boolean checkDuplicate(String s, int l, int r) {

        if (r >= s.length()) {
            return true;
        }
        if(s.substring(r).contains(s.substring(l,r))){
            return false;
        }else {
            checkDuplicate(s, l + 1, r + 1);
        }
        return true;
    }
}
