package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 10:41
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (dp[0] == 0) {
            return false;
        }
        for (int i = 1; i < nums.length; ++i) {
            dp[i] = Math.max(dp[i - 1] - 1, nums[i]);
            if (dp[i] < 1 && i != nums.length - 1) {
                return false;
            }
        }
        return true;
    }
}
