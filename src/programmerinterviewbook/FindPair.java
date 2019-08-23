package programmerinterviewbook;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 17:24
 */
public class FindPair {

    public int countPairs(int[] A, int n, int sum) {
        // write code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            Integer get = map.get(A[i]);
            int value = get == null ? 0 : get;
            map.put(A[i], value + 1);
            Integer tmp = map.get(sum - A[i]);
            count += tmp == null ? 0 : tmp;
        }
        return count;
    }
}
