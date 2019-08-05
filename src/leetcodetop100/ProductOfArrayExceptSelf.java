package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/5 12:50
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int[] res = new int[nums.length];
        int[] fwd = new int[nums.length];
        int[] bwd = new int[nums.length];
        fwd[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            fwd[i] = fwd[i - 1] * nums[i - 1];
        }
        bwd[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; --i) {
            bwd[i] = bwd[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; ++i) {
            res[i] = fwd[i] * bwd[i];
        }
        return res;
    }
}
