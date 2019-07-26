package niuke2019;

/**
 * 最长公共子串
 *
 * @author Aayers-ghw
 * @date 2019/7/26 16:39
 */
public class LongestSubstring {

    public static int findLongest(String A, int n, String B, int m) {
        // write code here
        int[][] dp = new int[n + 1][m + 1];
        int max = 0;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (A.charAt(n - i) == B.charAt(m - j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int longest = findLongest("1AB2345CD", 9, "12345EF", 7);
        System.out.println(longest);
    }
}
