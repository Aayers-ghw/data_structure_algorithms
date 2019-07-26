package algo.sorts_2;


import java.util.Arrays;

/**
 * @author Aayers-ghw
 * 快排
 */
public class QuickSort {

    /**
     * 快速排序，a是数组，n表示数组的大小
     *
     * @param a
     * @param n
     */
    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n - 1);
    }

    /**
     * 快速排序递归函数，p,r为下标
     *
     * @param a
     * @param p
     * @param r
     */
    public static void quickSortInternally(int a[], int p, int r) {
        if (p >= r) {
            return;
        }
        // 快速排序递归函数，p,r为下标
        int q = partition(a, p, r);
//        int q = position(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    /**
     * O(n)时间复杂度内求无序数组中的第K大元素
     */
    public static int topK(int[] a, int p, int r, int K) {
        if (p < r) {
            int q = partition(a, p, r);
            int index = q + 1 - p;
            if (index == K) {
                return a[index];
            } else if (index < K) {
                return topK(a, q + 1, r, K - index);
            } else {
                return topK(a, p, q - 1, K);
            }
        }
        return -1;
    }

    public static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j <= r; ++j) {
            if (a[j] < pivot) {
                swap(a, j, i);
                i++;
            }
        }
        a[r] = a[i];
        a[i] = pivot;
        return i;
    }

    private static int position(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left + 1;
        for (int i = left + 1; i <= right; ++i) {
            if (nums[i] < pivot) {
                swap(nums, i, j);
                j++;
            }
        }
        swap(nums, left, j - 1);
        return j - 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 2, 6, 8, 1};
        quickSort(a, 6);
        System.out.println(Arrays.toString(a));

//        int ans = topK(a, 0, a.length - 1, 3);
//        System.out.println(ans);
    }
}
