package interview.wangyi;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/3 14:51
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; ++i) {
            int x = scanner.nextInt();
            int cnt = 0;
            for (int j = 0; j < nums.length; ++j) {
                if (x == j + 1 || nums[x - 1] < nums[j]) {
                    continue;
                }
                cnt++;
            }
            double temp = (cnt * 1.0D) / n * 100;
            String res = String.format("%.6f", temp);
            System.out.println(res);
        }
    }
}
