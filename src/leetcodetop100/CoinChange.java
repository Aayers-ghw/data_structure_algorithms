package leetcodetop100;

/**
 * 动态规划，硬币找零最小个数问题，
 *
 * @author Aayers-ghw
 * @date 2019/8/1 16:22
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return -1;
        }
        //dp[i] 表示钱数为i时的最小硬币数的找零
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; ++i) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= amount; ++i) {
            for (int j = 0; j < coins.length; ++j) {
                if (i >= coins[j] && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int i = new CoinChange().coinChange(new int[]{1, 2, 5}, 11);
        System.out.println(i);
    }
}
