package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/9/8 10:35
 */
public class MaximumLengthOfRepeatedSubarray {

    public int findLength(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int res = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res;
    }
}
