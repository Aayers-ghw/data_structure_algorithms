package niuke2019;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/2 19:52
 */
public class Solution14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < n; ++i) {
            int temp = nums[i] + dp[i - 1];
            if (temp >= 0) {
                dp[i] = temp;
            } else {
                if (nums[i] >= 0) {
                    dp[i] = nums[i];
                } else {
                    dp[i] = 0;
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
