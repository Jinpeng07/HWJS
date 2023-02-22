import java.util.Scanner;

public class HJ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(in.nextLine());
        StringBuilder res = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (res.length() == 0) {
                res.append(sb.charAt(i));
            } else if (CheckExist(sb.charAt(i),res)) {
                continue;
            }else {
                res.append(sb.charAt(i));
            }
        }
        System.out.println(res.toString());
    }

    public static boolean CheckExist(char a, StringBuilder res){
        for (int i = 0; i < res.length(); i++) {
            if (a == res.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
