package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 23:11
 */
public class Coins {

    /**
     * ���������޵�Ӳ�ң���ֵΪ25�֡�10�֡�5�ֺ�1�֣����д�������n���м��ֱ�ʾ����
     * <p>
     * ����һ��int n���뷵��n���м��ֱ�ʾ������֤nС�ڵ���100000��Ϊ�˷�ֹ������뽫��Mod 1000000007��
     *
     * @param n
     * @return
     */
    public int countWays(int n) {
        int[] coins = new int[]{1, 5, 10, 25};
        //dp[i][sum] = ��ǰi��Ӳ�ҹ���sum �����������
        int[][] dp = new int[coins.length + 1][n + 1];
        for (int i = 0; i <= coins.length; ++i) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= coins.length; ++i) {
            for (int j = 1; j <= n; ++j) {
                for (int k = 0; k <= j / coins[i - 1]; ++k) {
                    dp[i][j] += (dp[i - 1][j - k * coins[i - 1]]) % 1000000007;
                }
            }
        }
        return dp[coins.length][n];
    }
}
