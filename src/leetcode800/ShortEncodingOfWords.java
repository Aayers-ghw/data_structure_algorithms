package leetcode800;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Aayers-ghw
 * @date 2019/8/27 9:32
 */
public class ShortEncodingOfWords {

    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        for (String word : words) {
            for (int i = 1; i < word.length(); ++i) {
                set.remove(word.substring(i));
            }
        }
        int res = 0;
        for (String word : set) {
            res += word.length() + 1;
        }
        return res;
    }
}
