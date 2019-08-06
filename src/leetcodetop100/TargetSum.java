package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/5 20:29
 */
public class TargetSum {

    static int res;

    public static int findTargetSumWays(int[] nums, int s) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        res = 0;
        dfs(nums, s, 0, 0);
        return res;
    }

    public static void dfs(int[] nums, int target, int sum, int k) {
        if (k == nums.length) {
            if (target == sum) {
                res++;
            }
            return;
        }
        dfs(nums, target, sum - nums[k], k + 1);
        dfs(nums, target, sum + nums[k], k + 1);
    }

    public static void main(String[] args) {
        int targetSumWays = findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);
        System.out.println(targetSumWays);
    }
}
