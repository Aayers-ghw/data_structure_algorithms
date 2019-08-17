package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 10:58
 */
public class WildcardMatching {

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i <= p.length(); ++i) {
            if (p.charAt(i) == '*') {
                dp[0][i] = dp[0][i - 1];
            }
        }
        for (int i = 1; i <= s.length(); ++i) {
            for (int j = 1; j <= p.length(); ++j) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') && dp[i - 1][j - 1];
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
