package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 22:56
 */
public class GoUpstairs {

    /**
     * �и�С��������¥�ݣ�¥����n��̨�ף�С��һ�ο�����1�ס�2�ס�3�ס�
     * ��ʵ��һ������������С���ж�������¥�ķ�ʽ��Ϊ�˷�ֹ������뽫���Mod 1000000007
     * <p>
     * ����һ��������int n���뷵��һ������������¥�ķ�ʽ������֤nС�ڵ���100000��
     *
     * @param n
     * @return
     */
    public int countWays(int n) {
        // write code here
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        if (n < 4) {
            return (int) dp[n];
        }
        for (int i = 4; i <= n; ++i) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007;
        }
        return (int) dp[n];
    }
}
