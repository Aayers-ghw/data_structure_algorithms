package leetcodetop100;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 14:55
 */
public class MedianFinder {

    private PriorityQueue<Integer> maxHead;
    private PriorityQueue<Integer> minHead;

    /** initialize your data structure here. */
    public MedianFinder() {
        maxHead = new PriorityQueue<>(Comparator.reverseOrder());
        minHead = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHead.isEmpty() || maxHead.peek() > num) {
            maxHead.add(num);
            if (maxHead.size() > minHead.size() + 1) {
                minHead.add(maxHead.poll());
            }
        } else {
            minHead.add(num);
            if (minHead.size() > maxHead.size() + 1) {
                maxHead.add(minHead.poll());
            }
        }
    }

    public double findMedian() {
        if (maxHead.size() > minHead.size()) {
            return maxHead.peek() * 1.0;
        }
        if(minHead.size() > maxHead.size()) {
            return minHead.peek() * 1.0;
        }
        return (minHead.peek() + maxHead.peek()) / 2.0;
    }
}
