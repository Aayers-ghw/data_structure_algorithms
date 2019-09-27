package interview.mafengwo;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/23 19:31
 */
public class Solution01 {

    /**
     * 输入
     * 输入为用户ID及用户签到的城市名称
     * <p>
     * 输出
     * 签到用户最多的前3个目的地及签到用户数
     * <p>
     * -       同一个用户多次签到同一个城市，只记一次
     * <p>
     * -       签到用户数相同的城市，优先展示拼音顺序靠前的城市名
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> map = new HashMap<>();
        String line = scanner.nextLine();
        String[] str = line.split(" ");
        for (int i = 0; i < str.length; ++i) {
            String[] tmp = str[i].split("-");
            if (!map.containsKey(tmp[1])) {
                Set set = new HashSet();
                set.add(str[0]);
                map.put(tmp[1], set);
            } else {
                map.get(tmp[1]).add(tmp[0]);
            }
        }
        String first_1 = null;
        int first_2 = 0;
        String second_1 = null;
        int second_2 = 0;
        String third_1 = null;
        int third_2 = 0;
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (first_1 == null) {
                first_1 = entry.getKey();
                first_2 = entry.getValue().size();
                continue;
            }
            if (second_1 == null) {
                second_1 = entry.getKey();
                second_2 = entry.getValue().size();
                continue;
            }
            if (third_1 == null) {
                third_1 = entry.getKey();
                third_2 = entry.getValue().size();
                continue;
            }
            if (entry.getValue().size() > first_2) {
                third_2 = second_2;
                third_1 = second_1;

                second_2 = first_2;
                second_1 = first_1;

                first_2 = entry.getValue().size();
                first_1 = entry.getKey();
            } else if (entry.getValue().size() > second_2) {
                third_2 = second_2;
                third_1 = second_1;

                second_2 = entry.getValue().size();
                second_1 = entry.getKey();
            } else if (entry.getValue().size() > third_2) {
                third_2 = entry.getValue().size();
                third_1 = entry.getKey();
            }
        }
        System.out.println(first_1 + " " + first_2);
        System.out.println(second_1 + " " + second_2);
        System.out.println(third_1 + " " + third_2);
    }
}
