package interview.beike;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 19:42
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) {
                nums[i] = scanner.nextInt();
            }
            Arrays.sort(nums);
            int res = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    int min = Math.min(nums[i], nums[j]);
                    int max = Math.max(nums[i], nums[j]);
                    if (min > max * 0.9) {
                        res++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
