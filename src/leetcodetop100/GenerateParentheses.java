package leetcodetop100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/7/30 17:48
 */
public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n < 1) {
            return res;
        }
        help(res, "", 0, 0, n);
        return res;
    }

    public static void help(List<String> res, String tmp, int open, int close, int n) {
        if (open > n || close > n || open < close) {
            return;
        }
        if (tmp.length() == 2 * n) {
            res.add(tmp);
        }
        help(res, tmp + "(", open + 1, close, n);
        help(res, tmp + ")", open, close + 1, n);
    }

    public static void main(String[] args) {
        List<String> res = generateParenthesis(3);
        System.out.println(res);
    }
}
