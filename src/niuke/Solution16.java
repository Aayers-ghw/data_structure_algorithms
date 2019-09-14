package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 15:29
 */
public class Solution16 {
    /**
     * һ�������壬����߷ֱ�Ϊx,y,z����Ϊ��Ȼ����
     *
     * ����Ҫ�����ɸ���ͬ�ĳ�����ڳɸ�ΪN��һ�������塣
     *
     * ÿ���1����������ְڷ��ĸ߶���һ���ģ�����Ϊ�����ְڷ��ȼۣ�����ÿ��ֻ�����ְڷ���
     *
     * ��һ���ж����ְڷ���
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
