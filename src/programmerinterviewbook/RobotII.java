package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 8:51
 */
public class RobotII {

    /**
     * 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。
     * 注意这次的网格中有些障碍点是不能走的。
     * <p>
     * 给定一个int[][] map(C++ 中为vector >),表示网格图，若map[i][j]为1则说明该点不是障碍点，否则则为障碍。
     * 另外给定int x,int y，表示网格的大小。请返回机器人从(0,0)走到(x - 1,y - 1)的走法数，
     * 为了防止溢出，请将结果Mod 1000000007。保证x和y均小于等于50
     *
     * @param map
     * @param x
     * @param y
     * @return
     */
    public int countWays(int[][] map, int x, int y) {
        // write code here
        int[][] dp = new int[x][y];
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j) {
                if (map[i][j] != 1) {
                    continue;
                }
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0 && j != 0) {
                    dp[0][j] = dp[0][j - 1];
                } else if (i != 0 && j == 0) {
                    dp[i][0] = dp[i - 1][0];
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
                }
            }
        }
        return dp[x - 1][y - 1];
    }
}
