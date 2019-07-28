package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 16:43
 */
public class HouseRobber {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[][] dp = new int[nums.length + 1][2];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for (int i = 0; i < nums.length; ++i) {
            dp[i + 1][0] = Math.max(dp[i][0], dp[i][1]);
            dp[i + 1][1] = nums[i] + dp[i][0];
        }
        return Math.max(dp[nums.length][0], dp[nums.length][1]);
    }
}
