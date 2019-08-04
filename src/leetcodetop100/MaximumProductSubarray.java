package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 14:07
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] f = new int[nums.length];
        int[] g = new int[nums.length];
        int res = nums[0];
        f[0] = nums[0];
        g[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            f[i] = Math.max(Math.max(f[i - 1] * nums[i], g[i - 1] * nums[i]), nums[i]);
            g[i] = Math.min(Math.min(f[i - 1] * nums[i], g[i - 1] * nums[i]), nums[i]);
            res = Math.max(f[i], res);
        }
        return res;
    }
}
