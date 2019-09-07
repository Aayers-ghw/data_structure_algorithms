package leetcode800;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/7 21:19
 */
public class LongestWordInDictionary {

    public String longestWord(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        Arrays.sort(words);
        Set<String> set = new LinkedHashSet<>();
        String res = "";
        for (String w : words) {
            if (w.length() == 1 || set.contains(w.substring(0, w.length() - 1))) {
                res = w.length() > res.length() ? w : res;
                set.add(w);
            }
        }
        return res;
    }
}
