package leetcode800;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aayers-ghw
 * @date 2019/9/7 14:34
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.remove(ch);
                ans++;
            } else {
                set.add(ch);
            }
        }
        if (set.isEmpty()) {
            return 2 * ans;
        }
        return 2 * ans + 1;
    }
}
