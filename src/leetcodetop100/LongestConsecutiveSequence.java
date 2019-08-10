package leetcodetop100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 11:14
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                int left = map.containsKey(num - 1) ? map.get(num - 1) : 0;
                int right = map.containsKey(num + 1) ? map.get(num + 1) : 0;
                int sum = left + right + 1;
                map.put(num, sum);
                ans = Math.max(ans, sum);
                map.put(num - left, sum);
                map.put(num + right, sum);
            } else {
                continue;
            }
        }
        return ans;
    }
}
