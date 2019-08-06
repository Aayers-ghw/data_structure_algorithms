package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/6 10:59
 */
public class PalindromicSubstrings {

    static int cout;
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        cout = 0;
        for (int i = 0; i < s.length(); ++i) {
            help(s, i, i);
            help(s, i, i + 1);
        }
        return cout;
    }

    public static void help(String s, int left, int right) {
        while (left >=0 && left < s.length() && right >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            cout++;
            left--;
            right++;
        }
    }
}
