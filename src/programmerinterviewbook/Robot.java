package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 8:48
 */
public class Robot {

    /**
     * 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。
     * 请设计一个算法，计算机器人有多少种走法。
     * <p>
     * 给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
     *
     * @param x
     * @param y
     * @return
     */
    public int countWays(int x, int y) {
        // write code here
        int[][] dp = new int[x][y];
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[x - 1][y - 1];
    }
}
