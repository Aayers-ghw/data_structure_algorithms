package niuke;

import java.util.*;

/**
 * 对K个不同字符的全排列组成的数组,  面试官从中随机拿走了一个, 剩下的数组作为输入,  请帮忙找出这个被拿走的字符串?
 * 比如[“ABC”, “ACB”, “BAC”, “CAB”, “CBA”] 返回 “BCA”
 *
 * @author Aayers-ghw
 * @date 2019/9/6 10:55
 */
public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            list.add(scanner.next());
        }
        Collections.sort(list);
        List<String> res = new ArrayList<>();
        char[] chars = list.get(0).toCharArray();
        Arrays.sort(chars);
        dfs(res, new ArrayList<>(), new String(chars), new boolean[list.get(0).length()]);
        int i = 0;
        for (String s : res) {
            if (i < list.size() && !s.equals(list.get(i))) {
                System.out.println(s);
                return;
            }
            i++;
        }
        System.out.println(res.get(res.size() - 1));
    }

    public static void dfs(List<String> res, List<Character> tmp, String str, boolean[] used) {
        if (tmp.size() == str.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tmp.size(); ++i) {
                sb.append(tmp.get(i));
            }
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < str.length(); ++i) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && str.charAt(i) == str.charAt(i - 1) && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            tmp.add(str.charAt(i));
            dfs(res, tmp, str, used);
            tmp.remove(tmp.size() - 1);
            used[i] = false;
        }
    }
}
