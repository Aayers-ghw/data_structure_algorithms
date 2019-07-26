package offer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 剑指offer第41道题
 *
 * @author Aayers-ghw
 * @date 2019/7/22 15:50
 */
public class Solution_41 {

    private PriorityQueue<Integer> minHead = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHead = new PriorityQueue<>(Comparator.reverseOrder());

    /**
     * 插入一个数
     *
     * @param num
     */
    public void insert(Integer num) {
        if (maxHead.isEmpty() || maxHead.peek() > num) {
            maxHead.offer(num);
            if (maxHead.size() - minHead.size() > 1) {
                minHead.offer(maxHead.poll());
            }
        } else {
            minHead.offer(num);
            if (minHead.size() - maxHead.size() > 1) {
                maxHead.offer(minHead.poll());
            }
        }
    }

    public Double getMedian() {
        if (maxHead.size() > minHead.size()) {
            return maxHead.peek() * 1.0;
        }
        if (maxHead.size() < minHead.size()) {
            return minHead.peek() * 1.0;
        }
        return (maxHead.peek() + minHead.peek()) / 2.0;
    }
}
