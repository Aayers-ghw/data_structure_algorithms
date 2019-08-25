package programmerinterviewbook;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 21:04
 */
public class LongestString {

    /**
     * 有一组单词，请编写一个程序，在数组中找出由数组中字符串组成的最长的串A，即A是由其它单词组成的(可重复)最长的单词。
     * <p>
     * 给定一个string数组str，同时给定数组的大小n。请返回最长单词的长度，保证题意所述的最长单词存在。
     *
     * @param str
     * @param n
     * @return
     */
    public int getLongest(String[] str, int n) {
        // write code here
        if (str == null || str.length == 0) {
            return 0;
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            map.put(s, 1);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        for (String string : str) {
            if (canBuildWord(string, true, map)) {
                return string.length();
            }
        }
        return 0;
    }

    private boolean canBuildWord(String str, boolean isOriginal, Map<String, Integer> map) {
        if (map.containsKey(str) && !isOriginal) {
            return true;
        }
        for (int i = 1; i < str.length(); ++i) {
            String left = str.substring(0, i);
            String right = str.substring(i);
            if (map.containsKey(left) && canBuildWord(right, false, map)) {
                return true;
            }
        }
        return false;
    }
}
