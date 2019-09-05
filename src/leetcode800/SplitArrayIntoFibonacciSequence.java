package leetcode800;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/9/5 11:06
 */
public class SplitArrayIntoFibonacciSequence {

    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<>();
        help(S, res);
        return res;
    }

    private boolean help(String s, List<Integer> res) {
        if (res.size() > 2 && s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); ++i) {
            if (i > 0 && s.charAt(0) == '0') {
                break;
            }
            long val = Long.valueOf(s.substring(0, i + 1));
            if (val > Integer.MAX_VALUE) {
                break;
            }
            int size = res.size();
            if (size > 2 && val > res.get(size - 1) + res.get(size - 2)) {
                break;
            }
            if (size < 2 || val == res.get(size - 1) + res.get(size - 2)) {
                res.add((int) val);
                if (help(s.substring(i + 1), res)) {
                    return true;
                }
                res.remove(res.size() - 1);
            }
        }
        return false;
    }
}
