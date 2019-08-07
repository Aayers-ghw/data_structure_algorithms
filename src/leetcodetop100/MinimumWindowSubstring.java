package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/7 14:37
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        String res = "";
        int[] map = new int[256];
        int left = 0;
        int right = 0;
        int count = t.length();
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int minLen = Integer.MAX_VALUE;
        while (right < s.length() || count == 0) {
            if (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    res = s.substring(left, right);
                }
                if (map[s.charAt(left++)]++ >= 0) {
                    count++;
                }
            } else {
                if (map[s.charAt(right++)]-- >= 1) {
                    count--;
                }
            }
        }
        return res;
    }
}
