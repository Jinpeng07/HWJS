import java.util.*;

public class HJ28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
//        Set<Integer> set = new HashSet();
        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (isSu(nums[i], nums[j])) {
                    total++;
                    if (!map.containsKey(nums[i])) {
                        map.put(nums[i], 1);
                    } else {
                        int value1 = map.get(nums[i]);
                        map.put(nums[i], value1 + 1);
                    }
                    if (!map.containsKey(nums[j])) {
                        map.put(nums[j], 1);
                    }else {
                        int value2 = map.get(nums[j]);
                        map.put(nums[j], value2 + 1);

                    }
                }
            }
        }
        System.out.println(total - map.size()/2);
        System.out.println(total);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.print(entry.getKey());
            System.out.print('-');
            System.out.print(entry.getValue());
            System.out.println();
        }
//        System.out.println(set.size() / 2);
//        System.out.println(res);
    }

    public static boolean isSu(int a, int b) {
        int sum = a + b;
        for (int i = 2; i <sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
