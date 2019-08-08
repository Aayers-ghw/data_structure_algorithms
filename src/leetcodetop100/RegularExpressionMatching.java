package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/8 8:47
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        return dfs(s, 0, s.length(), p, 0, p.length());
    }

    public static boolean dfs(String s, int i, int len1, String p, int j, int len2) {
        if (j == len2 && i == len1) {
            return true;
        }
        if (i != len1 && j == len2) {
            return false;
        }
        if (j + 1 < len2 && p.charAt(j + 1) == '*') {
            if (i < len1 && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
                return dfs(s, i + 1, len1, p, j + 2, len2) ||
                        dfs(s, i + 1, len1, p, j, len2) ||
                        dfs(s, i, len1, p, j + 2, len2);
            }
            return dfs(s, i, len1, p, j + 2, len2);
        }
        if (i < len1 && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
            return dfs(s, i + 1, len1, p, j + 1, len2);
        }
        return false;
    }
}
