import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class HJ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int count = in.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            if (!map.containsKey(a)) {
                map.put(a,1);
            }
        }
        int[] mapArray = new int[map.size()];
        int index = 0;
        for (int key:map.keySet()
             ) {
            mapArray[index] = key;
            index++;
        }
        Arrays.sort(mapArray);
        for (int i = 0; i < mapArray.length; i++) {
            System.out.println(mapArray[i]);
        }
    }
}