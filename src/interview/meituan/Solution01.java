package interview.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/11 15:54
 */
public class Solution01 {

    public static void main(String[] args) {
        String[] shuzi = "零、壹、贰、叁、肆、伍、陆、柒、捌、玖".split("、");
        String[] qian = "、十、佰、仟、万、十万、百万、千万、亿、十亿、百亿、千亿".split("、");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.substring(1, input.length() - 1).split(",");
        List<String> list = new ArrayList<>();
        for (String s : str) {
            s = s.substring(1, s.length() - 1);
            StringBuilder sb = new StringBuilder();
            String[] res = s.split("\\.");
            if (Double.parseDouble(s.substring(1)) == 0) {
                sb.append(shuzi[Integer.parseInt(String.valueOf(s.charAt(0)))]);
                sb.append(qian[res[0].length() - 1]);
                sb.append("元整");
                list.add(sb.toString());
                continue;
            }
            for (int i = 0; i < res[0].length(); ++i) {
                int tmp = Integer.parseInt(String.valueOf(res[0].charAt(i)));
                boolean zeroFlag = tmp == 0 ? true : false;
                if (zeroFlag) {
                    while (i < res[0].length() - 1 && res[0].charAt(i + 1) == '0') {
                        i++;
                    }
                    if (i != res[0].length() - 1) {
                        sb.append(shuzi[0]);
                    }
                } else {
                    sb.append(shuzi[tmp]);
                    sb.append(qian[res[0].length() - i - 1]);
                }
            }
            if (res.length == 1) {
                sb.append("元整");
                list.add(sb.toString());
                continue;
            }
            sb.append("元");
            for (int i = 0; i < res[1].length() && i < 2; ++i) {
                int tmp = Integer.parseInt(String.valueOf(res[1].charAt(i)));
                boolean zeroFlag = tmp == 0 ? true : false;
                if (zeroFlag) {
                    while (i < res[1].length() - 1 && res[1].charAt(i + 1) == '0') {
                        i++;
                    }
                } else {
                    sb.append(shuzi[tmp]);
                    if (i == 0) {
                        sb.append("角");
                    } else {
                        sb.append("分");
                    }
                }
            }
            list.add(sb.toString());
        }
        System.out.println(list);
    }
}
