package niuke;

import java.util.Scanner;

/**
 * 有1分，2分，5分，10分四种硬币，每种硬币数量无限，给定n分钱(n <= 100000)，有多少中组合可以组成n分钱？
 *
 * @author Aayers-ghw
 * @date 2019/9/6 16:54
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[]{1, 2, 5, 10};
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; ++i) {
            for (int j = coins[i]; j <= n; ++j) {
                dp[j] = (dp[j] + dp[j - coins[i]]) % 1000000007;
            }
        }
        System.out.println(dp[n]);
    }
}
