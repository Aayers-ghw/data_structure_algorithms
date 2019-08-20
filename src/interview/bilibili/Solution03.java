package interview.bilibili;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 18:56
 */
public class Solution03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; ++i) {
            w[i] = scanner.nextInt();
        }
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) {
            v[i] = scanner.nextInt();
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (j >= w[i - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
