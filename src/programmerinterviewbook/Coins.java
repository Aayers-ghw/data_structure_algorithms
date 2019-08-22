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
        int[] coin = new int[]{1, 5, 10, 25};
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j <= n; j++) {
                dp[j] = (dp[j] + dp[j - coin[i]]) % 1000000007;
            }
        }
        return dp[n];
    }
}
