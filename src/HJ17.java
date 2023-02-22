import java.util.Scanner;

public class HJ17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int x = 0, y = 0;
        String regex = "^[WSAD]\\d+";
        String[] sArray = s.split(";");
        for (String temp : sArray) {
            if (temp.matches(regex)) {
                int move = Integer.parseInt(temp.substring(1, temp.length()));
                switch (temp.charAt(0)){
                    case 'W':
                        y += move;
                        break;
                    case 'S':
                        y -= move;
                        break;
                    case 'A':
                        x -= move;
                        break;
                    case 'D':
                        x += move;
                        break;
                }
            }
        }
        System.out.printf("%d,%d", x, y);
    }
}
