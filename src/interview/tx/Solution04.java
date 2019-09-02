package interview.tx;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/1 20:14
 */
public class Solution04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = scanner.nextInt();
        }
        long res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i; j < nums.length; ++j) {
                long sum = 0;
                int min = Integer.MAX_VALUE;
                for (int k = i; k <= j; ++k) {
                    sum += nums[k];
                    if (min > nums[k]) {
                        min = nums[k];
                    }
                }
                res = Math.max(res, sum * min);
            }
        }
        System.out.println(res);
    }
}
