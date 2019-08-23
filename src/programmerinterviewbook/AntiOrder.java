package programmerinterviewbook;

import algo.array.Array;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 10:56
 */
public class AntiOrder {

    /**
     * ��һ�������������������������飬��ǰ��һ�����ں���һ�����֣����������������һ������ԡ�
     * �����һ����Ч���㷨��������������е�����Ը�����
     * <p>
     * ����һ��int����A�����Ĵ�Сn���뷵��A�е�����Ը�������֤nС�ڵ���5000��
     *
     * @param A
     * @param n
     * @return
     */
    public int count(int[] A, int n) {
        // write code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int[] copy = new int[n];
        System.arraycopy(A, 0, copy, 0 ,A.length);
        return inversePairsCore(A, copy, 0, n - 1);
    }

    private int inversePairsCore(int[] array, int[] copy, int start, int end) {
        if (start == end) {
            copy[start] = array[end];
            return 0;
        }
        int mid = (end - start) >> 1;
        int left = inversePairsCore(copy, array, start, start + mid);
        int right = inversePairsCore(copy, array, start + mid + 1, end);

        int count = 0;
        int i = start + mid;
        int j = end;
        int index = end;
        while (i >= start && j >= start + mid + 1) {
            if (array[i] > array[j]) {
                copy[index--] = array[i--];
                count += j - start - mid;
            } else {
                copy[index--] = array[j--];
            }
        }
        for (; i >= start; --i) {
            copy[index--] = array[i];
        }
        for (; j >= start + mid + 1; --j) {
            copy[index--] = array[j];
        }
        return count + left + right;
    }
}
