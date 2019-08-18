package programmerinterviewbook;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 9:50
 */
public class Same {

    /**
     * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
     * 这里规定大小写为不同字符，且考虑字符串中的空格。
     * <p>
     * 给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。
     * 保证两串的长度都小于等于5000。
     *
     * @param stringA
     * @param stringB
     * @return
     */
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if (stringA == null && stringB == null || stringA.length() == 0 && stringB.length() == 0) {
            return true;
        }
        if (stringA == null || stringB == null || stringA.length() == 0 || stringB.length() == 0) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : stringA.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : stringB.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
