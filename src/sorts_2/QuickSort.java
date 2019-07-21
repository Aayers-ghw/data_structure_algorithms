package sorts_2;

import java.util.Arrays;

/**
 * 快排
 *
 */
public class QuickSort {

	// 快速排序，a是数组，n表示数组的大小
	public static void quickSort(int[] a, int n) {
		quickSortInternally(a, 0, n - 1);
	}

	// 快速排序递归函数，p,r为下标
	public static void quickSortInternally(int a[], int p, int r) {
		if (p >= r) return;

		int q = partition(a, p, r);		// 快速排序递归函数，p,r为下标
		quickSortInternally(a, p, q - 1);
		quickSortInternally(a, q + 1, r);
	}
	
	/**
	 * O(n)时间复杂度内求无序数组中的第K大元素
	 */
	public static int topK(int a[], int p, int r, int K) {
		if(p < r) {
			int q = partition(a, p, r);
			int index = q + 1 - p;
			if(index == K) {
				return a[index];
			}else if(index < K){
				return topK(a, q + 1, r, K - index);
			}else {
				return topK(a, p, q - 1, K);
			}
		}
		return -1;
	}
	
	public static int partition(int[] a, int p, int r) {
		int i = p;
		int pivot = a[r];
		for (int j = p; j <= r; ++j) {
			if (a[j] < pivot) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
		}
		a[r] = a[i];
		a[i] = pivot;
		return i;

	}

	public static void main(String[] args) {
		int[] a = new int[] { 3, 4, 2, 6, 8, 1 };
//		quickSort(a, 6);
//		System.out.println(Arrays.toString(a));
		
		int ans = topK(a, 0, a.length - 1, 3);
		System.out.println(ans);
	}
}
