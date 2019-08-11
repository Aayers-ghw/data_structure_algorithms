package interview.zijietiao;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/11 19:18
 */
public class Solution03 {

    /**
     * 4
     * 3 9 2 7
     *
     * Êä³ö£º600
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        int minSum = Integer.MAX_VALUE;
        int[] dp = new int[n];
        dp[0] = 100;
        dp[1] = 200;
        for (int cnt = 100; cnt <= 10000; cnt += 100) {
            int temp = 0;
            for (int i = nums.length - 1; i >= 0; --i) {
                if (i == nums.length - 1) {
                    dp[i] = cnt;
                    temp += cnt;
                    continue;
                }
                if (nums[i] > nums[i + 1]) {
                    dp[i] = dp[i + 1] + 100;
                    temp += dp[i];
                } else if (nums[i] < nums[i + 1]) {
                    dp[i] = dp[i + 1] - 100;
                    if (dp[i] < 100) {
                        break;
                    }
                    temp += dp[i];
                } else {
                    dp[i] = dp[i + 1];
                    temp += dp[i];
                }
                if (i == 0) {
                    minSum = Math.min(minSum, temp);
                }
            }
        }
        System.out.println(minSum);
    }
}
