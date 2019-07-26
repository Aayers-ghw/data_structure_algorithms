package offer;

/**
 * @author Aayers-ghw
 * @date 2019/7/24 13:20
 */
public class Solution_48 {

    /**
     * 最长不含重复字符的子字符串
     * @param s 字符串
     * @return  最长不重复字符字串
     */
    public int longestSubstringWithoutDuplication(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] t = new int[26];
        for (int i = 0; i < 26; ++i) {
            t[i] = -1;
        }
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        dp[0] = 1;
        int max = dp[0];
        for (int i = 1; i < chars.length; ++i) {
            int index = t[chars[i] - 'a'];
            int d = i - index;
            dp[i] = (index == -1 || d > dp[i - 1]) ? dp[i - 1] + 1 : d;
            t[chars[i] - 'a'] = i;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
