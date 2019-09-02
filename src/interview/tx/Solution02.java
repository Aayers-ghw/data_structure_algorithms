package interview.tx;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/1 21:52
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][2];
        int res = 0;
        for (int i = 0; i < n; ++i) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
            res += nums[i][0] * (i) + nums[i][1] * (n - i - 1);
        }
        System.out.println(res);
    }
}
