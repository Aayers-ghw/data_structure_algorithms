package programmerinterviewbook;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 19:28
 */
public class SortString {

    /**
     * 请编写一个方法，对一个字符串数组进行排序，将所有变位词合并，保留其字典序最小的一个串。
     * 这里的变位词指变换其字母顺序所构成的新的词或短语。例如"triangle"和"integral"就是变位词。
     * <p>
     * 给定一个string的数组str和数组大小int n，请返回排序合并后的数组。保证字符串串长小于等于20，数组大小小于等于300。
     *
     * @param str
     * @param n
     * @return
     */
    public ArrayList<String> sortStrings(String[] str, int n) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length == 0) {
            return res;
        }
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            char[] chars = str[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            String value = map.get(key);
            if (value == null || value.compareTo(str[i]) > 0) {
                map.put(key, str[i]);
            }
        }
        res.addAll(map.values());
        Collections.sort(res);
        return res;
    }
}
