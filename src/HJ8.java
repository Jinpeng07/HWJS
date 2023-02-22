import java.util.*;

public class HJ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = in.nextInt();
            int value = in.nextInt();
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else {
                int newValue = map.get(key) + value;
                map.put(key,newValue);
            }
        }

        Set set = map.keySet();
        Object[] sortKey = set.toArray();
        Arrays.sort(sortKey);

        for (Object key:sortKey
             ) {
            System.out.println(key+" "+map.get(key));
        }
    }
}


