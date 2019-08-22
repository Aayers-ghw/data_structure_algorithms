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
        int[] coin = new int[]{1, 5, 10, 25};
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j <= n; j++) {
                dp[j] = (dp[j] + dp[j - coin[i]]) % 1000000007;
            }
        }
        return dp[n];
    }
}
