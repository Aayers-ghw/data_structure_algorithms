package interview.xunfei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/16 17:46
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); ++i) {
                if (Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i));
                }
            }
            if (sb.length() == 0) {
                System.out.println(-1);
                return;
            }
            char[] chars = sb.toString().toCharArray();
            Arrays.sort(chars);
            StringBuilder res = new StringBuilder();
            for (char ch : chars) {
                res.append(ch);
            }
            System.out.println(res.toString());
        }
    }
}
