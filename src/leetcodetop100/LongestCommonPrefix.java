package leetcodetop100;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/6 16:13
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int left = strs[0].length();
        int right = strs[strs.length - 1].length();
        int num = Math.min(left, right);
        for (int i = 0; i < num; ++i) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                sb.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
