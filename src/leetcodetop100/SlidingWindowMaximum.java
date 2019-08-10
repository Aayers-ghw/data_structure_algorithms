package leetcodetop100;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 11:19
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        List<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; ++i) {
            int begin = i - k + 1;
            if (queue.isEmpty()) {
                queue.add(i);
            } else {
                if (begin > queue.getFirst()) {
                    queue.pollFirst();
                }
            }
            while (!queue.isEmpty() && nums[i] > nums[queue.getLast()]) {
                queue.pollLast();
            }
            queue.add(i);
            if (begin >= 0) {
                list.add(nums[queue.getFirst()]);
            }
        }

        int[] d = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            d[i] = list.get(i);
        }
        return d;
    }
}
