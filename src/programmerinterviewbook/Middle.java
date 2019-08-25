package programmerinterviewbook;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 21:27
 */
public class Middle {

    /**
     * 现有一些随机生成的数字要将其依次传入，请设计一个高效算法，对于每次传入一个数字后，算出当前所有传入数字的中位数。
     * (若传入了偶数个数字则令中位数为第n/2小的数字，n为已传入数字个数)。
     * <p>
     * 给定一个int数组A，为传入的数字序列，同时给定序列大小n，请返回一个int数组，代表每次传入后的中位数。保证n小于等于1000。
     *
     * @param A
     * @param n
     * @return
     */
    public int[] getMiddle(int[] A, int n) {
        // write code here
        if (A == null || A.length == 0) {
            return new int[]{};
        }
        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            if (maxHeap.isEmpty() || maxHeap.peek() >= A[i]) {
                maxHeap.add(A[i]);
            } else {
                minHeap.add(A[i]);
            }
            if (maxHeap.size() - 1 > minHeap.size()) {
                minHeap.add(maxHeap.poll());
            }
            if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
            res[i] = maxHeap.peek();
        }
        return res;
    }
}
