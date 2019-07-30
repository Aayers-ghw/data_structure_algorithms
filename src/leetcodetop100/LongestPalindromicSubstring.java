package leetcodetop100;

/**
 * 最长回文子串
 *
 * @author Aayers-ghw
 * @date 2019/7/26 20:55
 */
public class LongestPalindromicSubstring {

    int maxLen = 0;
    int start = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; ++i) {
            searchPalindrome(s, i, i);
            searchPalindrome(s, i, i + 1);
        }
        return s.substring(start, start + maxLen);
    }

    private void searchPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxLen < right - left - 1) {
            maxLen = right - left - 1;
            start = left + 1;
        }
    }
}
