package niuke2019;

/**
 * 最长公共子序列
 *
 * @author Aayers-ghw
 * @date 2019/7/26 16:16
 */
public class LCS {
    public static int findLCS(String A, int n, String B, int m) {
        // write code here
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (A.charAt(n - i) != B.charAt(m - j)) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        System.out.println(findLCS("tysoklr", 7, "slvo", 4));
    }
}
