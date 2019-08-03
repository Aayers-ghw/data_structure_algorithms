package niuke2019;

import java.util.Scanner;

/**
 * 牛牛的背包问题
 *
 * @author Aayers-ghw
 * @date 2019/8/3 19:08
 */
public class Solution18 {

    private static long res;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long total = scanner.nextInt();
        long[] v = new long[n];
        scanner.nextLine();
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            v[i] = scanner.nextLong();
            sum += v[i];
        }
        res = 0;
        if (sum <= total) {
            System.out.println((int)Math.pow(2, n));
        } else {
            dfs(v, total, 0, 0);
            //均不添加也是一种情况
            System.out.println(res + 1);
        }
    }

    private static void dfs(long[] nums, long total, long sum, int index) {
        if (index >= nums.length) {
            return;
        }
        if (sum > total) {
            return;
        }
        dfs(nums, total, sum, index + 1);
        if (sum + nums[index] <= total) {
            res++;
            dfs(nums, total, sum + nums[index], index + 1);
        }
    }
}
