package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 16:03
 */
public class CountingBits {

    public int[] countBits(int num) {
        if (num < 0) {
            return null;
        }
        int[] res = new int[num + 1];
        int[] dp = new int[num + 1];
        for (int i = 0; i <= num; ++i) {
            res[i] = help(i, dp);
        }
        return res;
    }

    public int help(int n, int[] dp) {
        if (dp[n] != 0) {
            return dp[n];
        }
        int cnt = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                cnt++;
            }
            n = n >> 1;
        }
        dp[n] = cnt;
        return cnt;
    }
}
