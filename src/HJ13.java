import java.util.Scanner;

public class HJ13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArray = str.split(" ");
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]+" ");
        }
    }
}
