package leetcodetop100;

import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 11:18
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) {
            return false;
        }
        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < dp.length; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (wordDict.contains(s.substring(j, i + 1)) && (j == 0 || dp[j - 1])) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }
}
