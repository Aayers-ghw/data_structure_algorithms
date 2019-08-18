package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 23:11
 */
public class Coins {

    /**
     * 有数量不限的硬币，币值为25分、10分、5分和1分，请编写代码计算n分有几种表示法。
     * <p>
     * 给定一个int n，请返回n分有几种表示法。保证n小于等于100000，为了防止溢出，请将答案Mod 1000000007。
     *
     * @param n
     * @return
     */
    public int countWays(int n) {
        int[] coins = new int[]{1, 5, 10, 25};
        //dp[i][sum] = 用前i种硬币构成sum 的所有组合数
        int[][] dp = new int[coins.length + 1][n + 1];
        for (int i = 0; i <= coins.length; ++i) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= coins.length; ++i) {
            for (int j = 1; j <= n; ++j) {
                for (int k = 0; k <= j / coins[i - 1]; ++k) {
                    dp[i][j] += (dp[i - 1][j - k * coins[i - 1]]) % 1000000007;
                }
            }
        }
        return dp[coins.length][n];
    }
}
