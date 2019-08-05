package leetcodetop100;

import algo.array.Array;
import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/5 14:54
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0 || k < 0) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Queue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (o1, o2) -> (o2.getValue() - o1.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }
        while (res.size() > k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }
}
