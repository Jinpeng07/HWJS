import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HJ28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        Set<Integer> set = new HashSet();
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (isSu(nums[i], nums[j])) {
                    set.add(nums[i]);
                    set.add(nums[j]);
                    res++;
                }
            }
        }
        System.out.println(set);
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
