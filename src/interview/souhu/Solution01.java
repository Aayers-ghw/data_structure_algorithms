package interview.souhu;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/25 18:43
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l, r;
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            l = scanner.nextInt();
            r = scanner.nextInt();
            nums[i] = r - l;
            m -= l;
        }
        long[][] dp = new long[n][m + 1];
        for (int i = 0; i <= nums[0]; ++i) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j <= m; ++j) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else {
                    long sum = 0;
                    for (int k = 0; k <= nums[i] && k <= j; ++k) {
                        sum += dp[i - 1][j - k];
                    }
                    dp[i][j] = sum;
                }
            }
        }
        System.out.println(dp[n - 1][m]);
    }
}
