package interview.dajiang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 19:51
 */
public class Solution02 {

    private static int res;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            res = 0;
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            int[][] nums = new int[n][3];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 3; ++j) {
                    nums[i][j] = scanner.nextInt();
                }
            }
            dfs(nums, t, 0);
            System.out.println(res);
        }
    }

    public static void dfs(int[][] nums, int t, int i) {
        if (i >= nums.length || nums[i][2] <= 0) {
            return;
        }
        if (t - nums[i][0] >= 0) {
            res += nums[i][1];
            nums[i][2]--;
            dfs(nums, t - nums[i][0], i);
            dfs(nums, t - nums[i][0], i + 1);
        }
    }
}
