package interview.wangyi;

import algo.array.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/3 16:53
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            int m = scanner.nextInt();
            int[] nums = new int[m];
            for (int i = 0; i < m; ++i) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            if (nums.length < 2) {
                System.out.println("NO");
                continue;
            }
            int i;
            for (i = 2; i < nums.length; ++i) {
                if (nums[i] >= nums[i - 1] + nums[i - 2]) {
                    System.out.println("NO");
                    break;
                }
            }
            if (i == nums.length) {
                System.out.println("YES");
            }
        }
    }
}
