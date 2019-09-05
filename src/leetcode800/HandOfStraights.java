package leetcode800;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Aayers-ghw
 * @date 2019/9/5 20:57
 */
public class HandOfStraights {

    public boolean isNStraightHand(int[] hand, int W) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int it : map.keySet()) {
            if (map.get(it) > 0) {
                for (int i = W - 1; i >= 0; --i) {
                    if (map.getOrDefault(it + i, 0) < map.get(it)) {
                        return false;
                    }
                    map.put(it + i, map.get(it + i) - 1);
                }
            }
        }
        return true;
    }
}
