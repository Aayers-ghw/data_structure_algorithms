package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/8/26 14:50
 */
public class LargestSumOfAverages {

    public double largestSumOfAverages(int[] A, int K) {
        int len = A.length;
        double[] sum = new double[len];

        sum[0] = A[0];
        for (int i = 1; i < len; ++i) {
            sum[i] += sum[i - 1] + A[i];
        }
        return backTrack(A, len, sum, 0, K, new double[len][K + 1]);
    }

    private double backTrack(int[] A, int len, double[] sum, int index, int k, double[][] dp) {
        if (k == 1) {
            return (sum[len - 1] - sum[index] + A[index]) / (len - index);
        }
        if (dp[index][k] != 0) {
            return dp[index][k];
        }
        for (int i = index; i <= len - k; ++i) {
            dp[index][k] = Math.max(dp[index][k],
                    (((sum[i] - sum[index] + A[index]) * 1.0) / (i - index + 1)) +
                            backTrack(A, len, sum, i + 1, k - 1, dp));
        }
        return dp[index][k];
    }
}
