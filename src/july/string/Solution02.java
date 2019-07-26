package july.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串包含
 *
 * @author Aayers-ghw
 * @date 2019/7/26 11:19
 */
public class Solution02 {
    /**
     * 给定两个分别由字母组成的字符串A和字符串B，字符串B的长度比字符串A短。
     * 请问，如何最快地判断字符串B中所有字母是否都在字符串A里？
     *
     * @param a
     * @param b
     * @return
     */
    public boolean StringContain(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Map<Character, Integer> map = new HashMap<>(a.length());
        for (char ch : aa) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : bb) {
            if (map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
