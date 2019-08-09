package interview.beibao;

/**
 * @author Aayers-ghw
 * @date 2019/8/9 20:17
 */
public class pack {

    public int pack01Solution1(int m, int[] weight, int[] value) {
        int[][] dp = new int[weight.length + 1][value.length + 1];
        for (int i = 1; i <= weight.length; ++i) {
            for (int j = 1; j <= value.length; ++j) {
                if (weight[i] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i - 1]);
                }
            }
        }
    }
}
