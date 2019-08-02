package niuke2019;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/2 18:17
 */
public class Solution12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                nums[i] = scanner.nextInt();
            } else {
                nums[i] = nums[i - 1] + scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; ++i) {
            int q = scanner.nextInt();
            int res = help(nums, q);
            System.out.println(res);
        }
    }

    private static int help(int[] nums, int index) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left + 1 != right) {
            mid = (left + right) >> 1;
            if (index <= nums[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return index > nums[left] ? right + 1 : left + 1;
    }
}
