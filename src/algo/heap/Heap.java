package algo.heap;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 */
public class Heap {

    /**
     * 数组，从下标1开始存储数据
     */
    private int[] a;
    /**
     * 堆可以存储的最大数据个数
     */
    private int n;
    /**
     * 堆中已经存储的数据个数
     */
    private int count;

    public Heap(int capacity) {
        a = new int[capacity];
        n = capacity;
        count = 0;
    }

    /**
     * 往堆中插入数据，从下往上
     *
     * @param data
     */
    public void insert(int data) {
        if (count == n) {
            return;    //堆满了
        }
        ++count;
        a[count] = data;
        int i = count;
        //自下往上堆化
        while (i / 2 >= 1 && a[i] > a[i / 2]) {
            //交换下标为i和i/2的两个元素
            swap(a, i, i / 2);
            i = i / 2;
        }
    }

    /**
     * 删除堆顶元素
     */
    public void removeMax() {
        if (count == 0) {
            //堆中没有数据
            return;
        }
        a[1] = a[count];
        count--;
        heapify(a, n, 1);
    }

    public static void heapify(int[] a, int n, int i) {    //自上往下堆化
        while (true) {
            int maxPos = i;
            if (i * 2 <= n && a[i] < a[i * 2]) {
                maxPos = i * 2;
            }
            if (i * 2 + 1 <= n && a[maxPos] < a[i * 2 + 1]) {
                maxPos = i * 2 + 1;
            }
            if (maxPos == i) {
                break;
            }
            swap(a, i, maxPos);
            i = maxPos;
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 堆排序
     * 1.建堆
     * 2.排序
     */
    public static void buildHeap(int[] a, int n) {
        for (int i = n / 2; i >= 1; --i) {
            heapify(a, n, i);
        }
    }

    /**
     * n表示数据的个数，数组a中的数据从下标1到n的位置
     *
     * @param a
     * @param n
     */
    public static void sort(int[] a, int n) {
        buildHeap(a, n);
        int k = n;
        while (k > 1) {
            swap(a, 1, k);
            k--;
            heapify(a, k, 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 5, 4, 3, 2, 1};
        sort(a, 5);
        System.out.println(Arrays.toString(a));
    }

}
