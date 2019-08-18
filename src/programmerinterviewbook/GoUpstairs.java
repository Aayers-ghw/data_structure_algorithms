package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 22:56
 */
public class GoUpstairs {

    /**
     * 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。
     * 请实现一个方法，计算小孩有多少种上楼的方式。为了防止溢出，请将结果Mod 1000000007
     * <p>
     * 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
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
