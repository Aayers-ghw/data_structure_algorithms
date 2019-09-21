package interview.xiaomazhixing;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/18 18:50
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] color = new int[n];
        for (int i = 0; i < n; ++i) {
            color[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; ++i) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < i; ++j) {
                if (color[j] == color[i]) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        System.out.println(dp[n - 1]);
    }
}
