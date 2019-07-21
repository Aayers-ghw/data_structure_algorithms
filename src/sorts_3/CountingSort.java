package sorts_3;

import java.util.Arrays;

/**
 * ��������
 *
 */
public class CountingSort {

	// ��������a�����飬n�������С�����������д洢�Ķ��ǷǸ�������
	public static void countingSort(int[] a, int n) {
		if (n <= 1)
			return;

		// �������������ݵķ�Χ
		int max = a[0];
		for (int i = 1; i < n; ++i) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		// ����һ����������c���±��С[0,max]
		int[] c = new int[max + 1];
		for(int i = 0; i <= max; ++i) {
			c[i] = 0;
		}
		// ����ÿ��Ԫ�صĸ���������c��
		for (int i = 0; i < n; ++i) {
			c[a[i]]++;
		}

		// �����ۼ�
		for (int i = 1; i <= max; ++i) {
			c[i] += c[i - 1];
		}

		// ��ʱ����r���洢����֮��Ľ��
		int[] r = new int[n];
		// ��������Ĺؼ�������
		for (int i = n - 1; i >= 0; --i) {
			int index = c[a[i]] - 1;
			r[index] = a[i];
			c[a[i]]--;
		}
		
		// �����������a����
		for(int i = 0; i < n; ++i) {
			a[i] = r[i];
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {4,2,1,3,5};
		countingSort(a, 5);
		System.out.println(Arrays.toString(a));
	}
}
