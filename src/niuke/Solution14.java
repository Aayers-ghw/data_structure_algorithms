package niuke;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 11:16
 */
public class Solution14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] b = new int[n];
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hs.put(scanner.nextInt(), i);
        }
        for (int i = 0; i < n; i++) {
            b[i] = hs.get(scanner.nextInt());
        }
        System.out.println(lis(b));
    }

    /**
     * 求最长递增子序列的最大长度
     *
     * @param nums
     * @return
     */
    private static int lis(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int maxLen = 0;
        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] > nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }
}
