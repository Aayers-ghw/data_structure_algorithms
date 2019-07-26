package algo.sorts_1;

/**
 * 冒泡排序、插入排序、选择排序
 *
 */
public class Sorts {

	// 冒泡排序，a是数组，n表示数组大小
	public static void bubbleSort(int[] a, int n) {
		if (n <= 1)
			return;
		// 提前退出标志位
		boolean flag = false;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n - i - 1; ++j) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp; 	
					// 此次冒泡有数据交换
					flag = true;
				}
			}
			// 没有数据交换，提前退出
			if (flag == false) {
				break;
			}
		}
	}

	// 插入排序，a表示数组，n表示数组大小
	public static void insertionSort(int[] a, int n) {
		if (n <= 1)
			return;
		 // 查找要插入的位置并移动数据
		for (int i = 1; i < n; ++i) {
			int value = a[i];
			int j = i - 1;
			for (; j >= 0; --j) {
				if (a[j] > value) {
					a[j + 1] = a[j];
				}else {
					break;
				}
			}
			a[j + 1] = value;
		}
	}

	// 选择排序，a表示数组，n表示数组大小
	public static void selectionSort(int[] a, int n) {
		if(n <= 1) return;
		for(int i = 0; i < n; ++i) {
			//查找最小值
			int minIndex = i;
			for(int j = i + 1; j < n; ++j) {
				if(a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			
			//交换
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };
//		bubbleSort(a, 5);
//		insertionSort(a, 5);
//		selectionSort(a, 5);
//		System.out.println(Arrays.toString(a));
		
	}
}
