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
     * ����һЩ������ɵ�����Ҫ�������δ��룬�����һ����Ч�㷨������ÿ�δ���һ�����ֺ������ǰ���д������ֵ���λ����
     * (��������ż��������������λ��Ϊ��n/2С�����֣�nΪ�Ѵ������ָ���)��
     * <p>
     * ����һ��int����A��Ϊ������������У�ͬʱ�������д�Сn���뷵��һ��int���飬����ÿ�δ�������λ������֤nС�ڵ���1000��
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
