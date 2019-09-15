package interview.zhaoshangyinhang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 21:20
 */
public class Solution03 {

    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        dfs(str, "", 0);
        System.out.println(res);
    }

    private static void dfs(String str, String s, int start) {
        if (start == str.length()) {
            int sum = 0;
            for (int i = 0; i < s.length(); ++i) {
                sum = (sum * 10 + Integer.parseInt(s.charAt(i) + "")) % 1000000007;
            }
            if (sum % 13 == 5) {
                res = (res + 1) % 1000000007;
            }
            return;
        }
        if (Character.isDigit(str.charAt(start))) {
            dfs(str, s + str.charAt(start), start + 1);
        } else {
            for (int i = 0; i <= 9; ++i) {
                dfs(str, s + i, start + 1);
            }
        }
    }
}
