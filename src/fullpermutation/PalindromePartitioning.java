package fullpermutation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 10:06
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        backtrack(res, new ArrayList<>(), s, 0);
        return res;
    }

    public void backtrack(List<List<String>> res, List<String> list, String s, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(list));
        }
        for (int i = start; i < s.length(); ++i) {
            if (isPalindrome(s, start, i)) {
                list.add(s.substring(start, i + 1));
                backtrack(res, list, s, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
}
