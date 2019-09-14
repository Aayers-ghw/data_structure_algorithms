package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 15:29
 */
public class Solution16 {
    /**
     * 一个长方体，长宽高分别为x,y,z，都为自然数。
     *
     * 现在要把若干个相同的长方体摆成高为N的一根柱形体。
     *
     * 每层摆1个，如果两种摆法的高度是一样的，则认为这两种摆法等价，所以每层只有三种摆法。
     *
     * 求一共有多少种摆法。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int[][] dp = new int[200][400];
        dp[1][x] = 1;
        dp[1][y] = 1;
        dp[1][z] = 1;
        for (int i = 2; i < 200; ++i) {
            for (int j = 0; j < 300; ++j) {
                dp[i][j + x] += dp[i - 1][j];
                dp[i][j + y] += dp[i - 1][j];
                dp[i][j + z] += dp[i - 1][j];
            }
        }
        int sum=0;
        for(int i=0;i<200;i++){
            sum+=dp[i][n];
        }
        System.out.println(sum);
        scanner.close();
    }
}
