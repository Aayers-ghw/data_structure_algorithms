package leetcodetop100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/7/30 16:41
 */
public class LetterCombinationsOfaPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        String[] s = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        help(digits, s, "", 0, res);
        return res;
    }

    private static void help(String digits, String[] s, String out, int level, List<String> res) {
        if (level == digits.length()) {
            res.add(new String(out));
            return;
        }
        String str = s[digits.charAt(level) - '0'];
        for (int i = 0; i < str.length(); ++i) {
            help(digits, s, out + str.charAt(i), level + 1, res);
        }
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}
