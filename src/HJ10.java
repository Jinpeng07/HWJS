import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HJ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        String str = in.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }else {
                continue;
            }
        }
        System.out.println(map.size());
    }
}
