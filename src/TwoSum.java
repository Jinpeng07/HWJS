import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum (int[] numbers, int target) {
        // write code here
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = i+1 ; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(target - numbers[i])) {
                map.put(numbers[i], i);
            }else {
                return new int[]{map.get(target - numbers[i]), i + 1};
            }
        }
        return null;
    }
}
