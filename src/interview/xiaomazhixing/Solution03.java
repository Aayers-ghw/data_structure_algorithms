package interview.xiaomazhixing;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/18 18:50
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        double res = 0;
        for (int i = 0; i < n - k; ++i) {
            int sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; ++j) {
                sum += nums[j];
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
            }
            double tmp = 1.0 * (sum - max - min) / (k - 2);
            res = Math.max(res, tmp);
        }
        System.out.println(res);
    }
}
