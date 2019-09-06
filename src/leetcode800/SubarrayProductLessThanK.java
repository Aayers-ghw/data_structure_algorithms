package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/9/6 10:13
 */
public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k < 1) {
            return 0;
        }
        int left = 0;
        int res = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; ++i) {
            prod *= nums[i];
            while (left <= i && prod >= k) {
                prod /= nums[left++];
            }
            res += (i - left + 1);
        }
        return res;
    }
}
