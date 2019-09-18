package interview.xiaomazhixing;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/18 18:50
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] color = new int[n];
        for (int i = 0; i < n; ++i) {
            color[i] = scanner.nextInt();
        }
        int[] dp = new int[n];

        System.out.println(dp[n - 1]);
    }
}
