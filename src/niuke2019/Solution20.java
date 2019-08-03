package niuke2019;

import java.util.*;

/**
 * 会话列表
 *
 * @author Aayers-ghw
 * @date 2019/8/3 20:26
 */
public class Solution20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; ++i) {
                nums[i] = scanner.nextInt();
            }
            Set<Integer> set = new LinkedHashSet<>();
            for (int i = nums.length - 1; i >= 0; --i) {
                if (!set.contains(nums[i])) {
                    set.add(nums[i]);
                }
            }
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }
    }
}
