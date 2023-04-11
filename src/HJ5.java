import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('0', 0);
//        map.put('1', 1);
//        map.put('2', 2);
//        map.put('3', 3);
//        map.put('4', 4);
//        map.put('5', 5);
//        map.put('6', 6);
//        map.put('7', 7);
//        map.put('8', 8);
//        map.put('9', 9);
//        map.put('a', 10);
//        map.put('b', 11);
//        map.put('c', 12);
//        map.put('d', 13);
//        map.put('e', 14);
//        map.put('f', 15);
//        int res = 0;
//        int n = 1;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if(map.containsKey(s.charAt(i))){
//                res = res + n * map.get(s.charAt(i));
//            }
//            n *= 16;
//        }
        int res = 0;
        int base = 1;
        s = s.substring(2);
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isDigit(chars[i])) {
                int num = chars[i] - '0';
                res += base * num;
                base *= 16;
            } else if (Character.isLetter(chars[i])) {
                int num = chars[i] - 'a' + 10;
                res += base * num;
                base *= 16;
            }
        }
        System.out.println(res);
    }
}
