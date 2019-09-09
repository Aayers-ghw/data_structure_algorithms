package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 16:54
 */
public class Solution04 {

    /**
     * 判断一个无序数组中是否存在长度为3的递增子序列。（不要求连续）（满足O(n)的时间复杂度和O(1)的空间复杂度。）
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for (int num : nums) {
            if (small >= num) {
                small = num;
            } else if (big >= num) {
                big = num;
            } else {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
