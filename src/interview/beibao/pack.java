package interview.beibao;

/**
 * @author Aayers-ghw
 * @date 2019/8/9 20:17
 */
public class pack {

    /**
     * 01背包问题
     *
     * @param v      背包容量
     * @param n      物品的总类
     * @param weight 物品的重量
     * @param value  物品的价值
     * @return
     */
    public int pack01Solution1(int v, int n, int[] weight, int[] value) {
        //dp[i][j]表示前i件物品能装入容量为j的背包中的物品价值总和的最大值(注意是最大值)
        int[][] dp = new int[n + 1][v + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= v; ++j) {
                if (j < weight[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                }
            }
        }
        return dp[n][v];
    }

    /**
     * 01背包优化解法
     */
    public int pack01Solution2(int v, int n, int[] weight, int[] value) {
        //dp[i]表示容量为i的背包所能装入物品的最大价值
        int[] dp = new int[v + 1];
        for (int i = 1; i <= n; ++i) {
            //逆序实现
            for (int j = v; j >= weight[i]; --j) {
                dp[j] = Math.max(dp[j], dp[j - weight[i - 1]] + value[i - 1]);
            }
        }
        return dp[v];
    }

    /**
     * 多重背包
     *
     * @param v
     * @param n
     * @param weight
     * @param value
     * @param nums   单个物品的数量
     * @return
     */
    public int packMutiSolutionk(int v, int n, int[] weight, int[] value, int[] nums) {
        int[][] dp = new int[n + 1][v + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= v; ++j) {
                int maxV = Math.min(nums[i - 1], j / weight[i - 1]);
                for (int k = 0; k <= maxV; ++k) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - k * weight[i - 1]] + k * value[i - 1]);
                }
            }
        }
        return dp[n][v];
    }

    /**
     * 多重背包
     *
     * @param v
     * @param n
     * @param weight
     * @param value
     * @return
     */
    public int packComSolution(int v, int n, int[] weight, int[] value) {
        int[] dp = new int[v + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = weight[i]; j <= v; ++j) {
                dp[j] = Math.max(dp[j], dp[j - weight[i - 1]] + value[i - 1]);
            }
        }
        return dp[v];
    }

    /**
     * 有1分，2分，5分，10分四种硬币，每种硬币数量无限，给定n分钱(n<10000)，有多少中组合可以组成n分钱？
     *
     * @return
     */
    public static int countWays(int[] coins, int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < coins.length; ++i) {
            for (int j = coins[i]; j <= n; ++j) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[n];
    }

    public static int countWays2(int[] coins, int n) {
        //dp[i][sum]前i种硬币要组成sum的组合数
        int[][] dp = new int[coins.length][n + 1];
        for (int i = 0; i <= n; ++i) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < coins.length; ++i) {
            for (int j = 1; j <= n; ++j) {
                dp[i][j] = 0;
                for (int k = 0; k <= j / coins[i - 1]; ++k) {
                    dp[i][j] += dp[i - 1][j - k * coins[i - 1]];
                }
            }
        }
        return dp[coins.length - 1][n];
    }
}
