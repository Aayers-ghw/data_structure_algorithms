package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 13:22
 */
public class MaxSum {

    /**
     * ����һ�������и����������飬���ҳ��ܺ������������С�
     * <p>
     * ����һ��int����A�������Сn���뷵�������������еĺ͡���֤n�Ĵ�СС�ڵ���3000��
     *
     * @param A
     * @param n
     * @return
     */
    public int getMaxSum(int[] A, int n) {
        // write code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = A[0];
        int maxSum = dp[0];
        for (int i = 1; i < A.length; ++i) {
            if (dp[i - 1] < 0) {
                dp[i] = A[i];
            } else {
                dp[i] = dp[i - 1] + A[i];
            }
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}
