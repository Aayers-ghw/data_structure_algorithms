package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/7/23 10:57
 */
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            int sum = nums[i];
            if (sum == k) {
                ans++;
                continue;
            }
            if (sum > k) {
                continue;
            }
            for (int j = i + 1; j < nums.length; ++j) {
                sum += nums[j];
                if (sum == k) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        subarraySum(new int[]{28,54,7,-70,22,65,-6}, 100);
    }
}
