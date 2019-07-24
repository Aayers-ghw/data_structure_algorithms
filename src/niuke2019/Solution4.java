package niuke2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/7/24 20:05
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 3) {
            return;
        }
        int res = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        scanner.nextLine();
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; --i) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[i] + nums[left] > nums[right]
                        && nums[i] + nums[right] > nums[left]
                        && nums[left] + nums[right] > nums[i]) {
                    res += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(res);
    }
}
