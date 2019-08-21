package programmerinterviewbook;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Aayers-ghw
 * @date 2019/8/21 9:18
 */
public class Permutation {

    /**
     * 编写一个方法，确定某字符串的所有排列组合。
     * <p>
     * 给定一个string A和一个int n,代表字符串和其长度，请返回所有该字符串字符的排列，
     * 保证字符串长度小于等于11且字符串中字符均为大写英文字符，排列中的字符串按字典序从大到小排序。(不合并重复字符串)
     *
     * @param A
     * @return
     */
    public ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        if (A == null || A.length() == 0) {
            return res;
        }
        dfs(res, A.toCharArray(), 0);
        Collections.sort(res);
        Collections.reverse(res);
        return res;
    }

    public void dfs(ArrayList<String> res, char[] chars, int start) {
        if (start == chars.length) {
            res.add(new String(chars));
            return;
        }
        for (int i = start; i < chars.length; ++i) {
            swap(chars, start, i);
            dfs(res, chars, start + 1);
            swap(chars, start, i);
        }
    }

    public void swap(char[] chars, int i, int j) {
        char ch = chars[i];
        chars[i] = chars[j];
        chars[j] = ch;
    }
}
