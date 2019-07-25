package leetcode;

/**
 * 股票的最大利润
 *
 * @author Aayers-ghw
 * @date 2019/7/25 19:25
 */
public class Solution_63 {

    public static int maxDiff(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int min = nums[0];
        int maxDiff = nums[1] - min;
        for (int i = 2; i < nums.length; ++i) {
            if (min > nums[i - 1]) {
                min = nums[i - 1];
            }
            maxDiff = Math.max(maxDiff, nums[i] - min);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int maxDiff = maxDiff(new int[]{9, 11, 8, 5, 7, 12, 16, 14});
        System.out.println(maxDiff);
    }
}
