package leetcode800;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/9/7 18:30
 */
public class LongestArithmeticSequence {

    public int longestArithSeqLength(int[] A) {
        int res = 2;
        Map<Integer, Integer>[] dp = new HashMap[A.length];
        for (int i = 0; i < A.length; ++i) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; ++j) {
                int d = A[i] - A[j];
                dp[i].put(d, dp[j].getOrDefault(d, 1) + 1);
                res = Math.max(res, dp[i].get(d));
            }
        }
        return res;
    }
}
