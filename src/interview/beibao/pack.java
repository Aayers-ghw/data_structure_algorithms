package interview.beibao;

/**
 * @author Aayers-ghw
 * @date 2019/8/9 20:17
 */
public class pack {

    /**
     * 01��������
     *
     * @param v      ��������
     * @param n      ��Ʒ������
     * @param weight ��Ʒ������
     * @param value  ��Ʒ�ļ�ֵ
     * @return
     */
    public int pack01Solution1(int v, int n, int[] weight, int[] value) {
        //dp[i][j]��ʾǰi����Ʒ��װ������Ϊj�ı����е���Ʒ��ֵ�ܺ͵����ֵ(ע�������ֵ)
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
     * 01�����Ż��ⷨ
     */
    public int pack01Solution2(int v, int n, int[] weight, int[] value) {
        //dp[i]��ʾ����Ϊi�ı�������װ����Ʒ������ֵ
        int[] dp = new int[v + 1];
        for (int i = 1; i <= n; ++i) {
            //����ʵ��
            for (int j = v; j >= weight[i]; --j) {
                dp[j] = Math.max(dp[j], dp[j - weight[i - 1]] + value[i - 1]);
            }
        }
        return dp[v];
    }

    /**
     * ���ر���
     *
     * @param v
     * @param n
     * @param weight
     * @param value
     * @param nums   ������Ʒ������
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
     * ���ر���
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
     * ��1�֣�2�֣�5�֣�10������Ӳ�ң�ÿ��Ӳ���������ޣ�����n��Ǯ(n<10000)���ж�������Ͽ������n��Ǯ��
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
        //dp[i][sum]ǰi��Ӳ��Ҫ���sum�������
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
