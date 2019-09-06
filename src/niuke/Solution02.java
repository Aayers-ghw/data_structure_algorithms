package niuke;

import java.util.Scanner;

/**
 * ��1�֣�2�֣�5�֣�10������Ӳ�ң�ÿ��Ӳ���������ޣ�����n��Ǯ(n <= 100000)���ж�������Ͽ������n��Ǯ��
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
