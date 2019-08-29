package leetcode800;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/8/27 18:35
 */
public class BinaryTreesWithFactors {

    public int numFactoredBinaryTrees(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        Map<Integer, Long> map = new HashMap<>();
        long count = 1;
        map.put(A[0], count);
        for (int i = 1; i < A.length; ++i) {
            count = 1;
            for (Integer n : map.keySet()) {
                if (A[i] % n == 0 && map.containsKey(A[i] / n)) {
                    count += map.get(n) * map.get(A[i] / n);
                }
            }
            map.put(A[i], count);
        }
        long sum = 0;
        for (Integer n : map.keySet()) {
            sum = (sum + map.get(n)) % ((int) Math.pow(10, 9) + 7) ;
        }
        return (int)sum;
    }
}
