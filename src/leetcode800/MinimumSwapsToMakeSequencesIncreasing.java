package leetcode800;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/26 11:11
 */
public class MinimumSwapsToMakeSequencesIncreasing {

    public int minSwap(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || A.length != B.length) {
            return 0;
        }
        int n = A.length;
        int[] swap = new int[n];
        int[] noSwap = new int[n];
        Arrays.fill(swap, n);
        Arrays.fill(noSwap, n);
        swap[0] = 1;
        noSwap[0] = 0;
        for (int i = 1; i < n; ++i) {
            if (A[i] > A[i - 1] && B[i] > B[i - 1]) {
                noSwap[i] = noSwap[i - 1];
                swap[i] = swap[i - 1] + 1;
            }
            if (A[i] > B[i - 1] && B[i] > A[i - 1]) {
                noSwap[i] = Math.min(noSwap[i], swap[i - 1]);
                swap[i] = Math.min(swap[i], noSwap[i - 1] + 1);
            }
        }
        return Math.min(swap[n - 1], noSwap[n - 1]);
    }
}
