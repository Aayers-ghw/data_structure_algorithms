package interview.youzan;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 15:15
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            int cnt = 1;
            char ch = str.charAt(i);
            while (i + 1 < str.length() && ch == str.charAt(i + 1)) {
                cnt++;
                i++;
            }
            sb.append(ch).append(cnt);
        }
        if (sb.length() >= str.length()) {
            System.out.println(str);
        } else {
            System.out.println(sb.toString());
        }
    }
}
