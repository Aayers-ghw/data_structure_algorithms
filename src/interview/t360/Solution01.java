package interview.t360;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/15 18:55
 */
public class Solution01 {

    /**
     * 英语老师看你老是在英语课上和周围同学交头接耳，所以给你布置了一份额外的家庭作业来惩罚惩罚你：
     * 你有一个字符串s，请你在s的所有子串中，找到出现次数最多的子串，告诉老师它的出现次数。
     * <p>
     * 输入
     * 共一行，一个字符串s，仅由英文小写字母组成，1≤|s|≤10000。
     * <p>
     * 输出
     * 一个正整数，表示最大出现次数。
     * <p>
     * <p>
     * 样例输入
     * aba
     * 样例输出
     * 2
     * <p>
     * 提示
     * aba的所有子串为a、b、a、ab、ba、aba，其中a的出现次数最多，出现了2次。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            for (int j = i + 1; j <= str.length(); ++j) {
                res.add(str.substring(i, j));
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < res.size(); ++i) {
            String key = res.get(i);
            if (map.containsKey(key)) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
