package algo.sorts_2;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * 归并排序
 */
public class MergeSort {

    /**
     * 归并排序算法, a是数组，n表示数组大小
     *
     * @param a
     * @param n
     */
    public static void mergeSort(int[] a, int n) {
        mergeSortInternally(a, 0, n - 1);
    }

    /**
     * 递归调用函数
     *
     * @param a
     * @param p
     * @param r
     */
    public static void mergeSortInternally(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = p + (r - p) / 2;
        mergeSortInternally(a, p, q);
        mergeSortInternally(a, q + 1, r);

        merge(a, p, q, r);
    }

    public static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int[] temp = new int[r - p + 1];
        int k = 0;
        while (i <= q && j <= r) {
            if (a[i] > a[j]) {
                temp[k++] = a[j++];
            } else {
                temp[k++] = a[i++];
            }
        }

        // 判断哪个子数组中有剩余的数据
        int start = i;
        int end = q;

        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组tmp
        while (start <= end) {
            temp[k++] = a[start++];
        }

        // 将tmp中的数组拷贝回a[p...r]
        for (i = 0; i <= r - p; ++i) {
            a[i + p] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] res = new int[]{2, 5, 1, 6, 7};
        mergeSort(res, 5);
        System.out.println(Arrays.toString(res));
    }

}
