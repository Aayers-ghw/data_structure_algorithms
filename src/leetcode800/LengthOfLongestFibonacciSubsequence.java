package leetcode800;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aayers-ghw
 * @date 2019/9/7 20:26
 */
public class LengthOfLongestFibonacciSubsequence {

    public int lenLongestFibSubseq(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }
        int res = 0;
        for (int i = 0; i < A.length; ++i) {
            for (int j = i + 1; j < A.length; ++j) {
                int a = A[i];
                int b = A[j];
                int cnt = 2;
                while (set.contains(a + b)) {
                    b = a + b;
                    a = b - a;
                    ++cnt;
                }
                res = Math.max(res, cnt);
            }
        }
        return res > 2 ? res : 0;
    }
}
