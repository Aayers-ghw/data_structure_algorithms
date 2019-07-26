package algo.sorts_1;

/**
 * ð�����򡢲�������ѡ������
 *
 */
public class Sorts {

	// ð������a�����飬n��ʾ�����С
	public static void bubbleSort(int[] a, int n) {
		if (n <= 1)
			return;
		// ��ǰ�˳���־λ
		boolean flag = false;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n - i - 1; ++j) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp; 	
					// �˴�ð�������ݽ���
					flag = true;
				}
			}
			// û�����ݽ�������ǰ�˳�
			if (flag == false) {
				break;
			}
		}
	}

	// ��������a��ʾ���飬n��ʾ�����С
	public static void insertionSort(int[] a, int n) {
		if (n <= 1)
			return;
		 // ����Ҫ�����λ�ò��ƶ�����
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

	// ѡ������a��ʾ���飬n��ʾ�����С
	public static void selectionSort(int[] a, int n) {
		if(n <= 1) return;
		for(int i = 0; i < n; ++i) {
			//������Сֵ
			int minIndex = i;
			for(int j = i + 1; j < n; ++j) {
				if(a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
			
			//����
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
