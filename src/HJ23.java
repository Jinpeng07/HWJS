import java.util.*;

public class HJ23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.nextLine();
        int lessCount = 20;
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }else {
                map.put(c, map.get(c) + 1);
            }
        }
        for(int v : map.values()){
            if (v < lessCount) {
                lessCount = v;
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == lessCount) {
                list.add(entry.getKey());
            }
        }
        for (Character character : list) {
            //将字符转为字符串 String.valueOf(character)也行
            s = s.replaceAll(character.toString(), "");
        }
//        for (int i = 0; i < s.length(); i++) {
//            boolean exist = false;
//            for (Character character : list) {
//                if (s.charAt(i) == character) {
//                    exist = true;
//                    break;
//                }
//            }
//            if (!exist) {
//                System.out.print(s.charAt(i));
//            }
//        }
        System.out.println(s);
    }
}
