package interview.tongcheng;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/12 19:48
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                nums[i][j] = scanner.nextInt();
            }
        }
        int[][] dp = new int[m][n];
        dp[0][0] = nums[0][0];
        for (int i = 1; i < n; ++i) {
            dp[0][i] = dp[0][i - 1] + nums[0][i];
        }
        for (int i = 1; i < m; ++i) {
            dp[i][0] = dp[i - 1][0] + nums[i][0];
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + nums[i][j];
            }
        }
        System.out.println(dp[m - 1][n - 1]);
    }
}
