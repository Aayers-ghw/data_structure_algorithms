package leetcode800;

import leetcodetop100.WordBreak;

/**
 * @author Aayers-ghw
 * @date 2019/8/26 14:38
 */
public class ExpressiveWords {

    public int expressiveWords(String S, String[] words) {
        int res = 0;
        for (String word : words) {
            int i = 0;
            int j = 0;
            for (; i < S.length(); ++i) {
                if (j < word.length() && S.charAt(i) == word.charAt(j)) {
                    j++;
                } else if (i > 0 && S.charAt(i) == S.charAt(i - 1)
                        && i + 1 < S.length() && S.charAt(i) == S.charAt(i + 1)) {
                    i++;
                } else if (!(i > 1 && S.charAt(i - 1) == S.charAt(i - 2))) {
                    break;
                }
            }
            if (i == S.length() && j == word.length()) {
                res++;
            }
        }
        return res;
    }
}
