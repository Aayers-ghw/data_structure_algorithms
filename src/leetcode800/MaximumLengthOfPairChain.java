package leetcode800;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Aayers-ghw
 * @date 2019/9/8 10:21
 */
public class MaximumLengthOfPairChain {

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int res = 0;
        for (int i = 0; i < pairs.length;) {
            int tmp = pairs[i][1];
            res++;
            while (i < pairs.length && pairs[i][0] <= tmp) {
                ++i;
            }
        }
        return res;
    }
}
