package algo.heap;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 */
public class Heap {

    /**
     * ���飬���±�1��ʼ�洢����
     */
    private int[] a;
    /**
     * �ѿ��Դ洢��������ݸ���
     */
    private int n;
    /**
     * �����Ѿ��洢�����ݸ���
     */
    private int count;

    public Heap(int capacity) {
        a = new int[capacity];
        n = capacity;
        count = 0;
    }

    /**
     * �����в������ݣ���������
     *
     * @param data
     */
    public void insert(int data) {
        if (count == n) {
            return;    //������
        }
        ++count;
        a[count] = data;
        int i = count;
        //�������϶ѻ�
        while (i / 2 >= 1 && a[i] > a[i / 2]) {
            //�����±�Ϊi��i/2������Ԫ��
            swap(a, i, i / 2);
            i = i / 2;
        }
    }

    /**
     * ɾ���Ѷ�Ԫ��
     */
    public void removeMax() {
        if (count == 0) {
            //����û������
            return;
        }
        a[1] = a[count];
        count--;
        heapify(a, n, 1);
    }

    public static void heapify(int[] a, int n, int i) {    //�������¶ѻ�
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
     * ������
     * 1.����
     * 2.����
     */
    public static void buildHeap(int[] a, int n) {
        for (int i = n / 2; i >= 1; --i) {
            heapify(a, n, i);
        }
    }

    /**
     * n��ʾ���ݵĸ���������a�е����ݴ��±�1��n��λ��
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
