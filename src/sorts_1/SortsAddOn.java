package sorts_1;

import java.util.Arrays;

/**
 * ����ð���㷨 �������ð�ݸ��׶��������㷨����
 * ϣ������
 *
 */
public class SortsAddOn {

	public static void main(String[] args) {
	    int[] arr = {3, 2, 6, 4, 5, 1, 9, 20, 13, 16};
//	     bubbleDownSort(arr);
	    shellSort(arr);
//	    System.out.println(Arrays.toString(arr));
	  }
	
	 /**
	   * ����ð�ݡ����ܱ�ð�ݸ��׶���
	   * 
	   * �㷨��Ҫ��
	   * ��0��ʼ�������Ԫ��ȥ�����������Ԫ�رȽϣ�����������Ԫ�ش��ں����ĳ��Ԫ�أ��򽻻���
	   * 3 2 6 4 5 1
	   * ��һ���Ǵ� index=0 Ҳ���� 3�� ��ʼ��index=1�����������ֱȽ�
	   *  3 ���� 2����������Ϊ 2 3 6 4 5 1����ʱindex=0��λ�ñ�Ϊ��2
	   *    ����������2��index=2�Ƚ�
	   *  2 ������ 6 ������
	   *  2 ������ 4 ������
	   *  2 ������ 5 ������
	   *  2 ���� 1����������Ϊ 1 3 6 4 5 2����һ��������ɡ�
	   * 
	   * �ڶ����Ǵ� index=1 Ҳ���� 3����ʼ��index=2�����������ֱȽ�
	   *  3 ������ 6 ������
	   *  3 ������ 4 ������
	   *  3 ������ 5 ������
	   *  3 ���� 2����������Ϊ 1 2 6 4 5 3���ڶ���������ɡ�
	   * 
	   * �������Ǵ� index=2 Ҳ���� 6����ʼ��index=3�����������ֱȽ�
	   *  6 ���� 4����������Ϊ 1 2 4 6 5 3, ��ʱ index = 2 ��λ�ñ�Ϊ��4
	   *     ����������4��index=4�Ƚ�
	   *  4 ������ 5 ������
	   *  4 ���� 3����������Ϊ 1 2 3 6 5 4��������������ɡ�
	   * 
	   * �������Ǵ� index=3 Ҳ���� 6����ʼ��index=4�����������ֱȽ�
	   *  6 ���� 5����������Ϊ 1 2 3 5 6 4, ��ʱ index = 3 ��λ�ñ�Ϊ��5
	   *     ����������5��index=5�Ƚ�
	   *  5 ���� 4����������Ϊ 1 2 3 4 6 5, ������������ɡ�
	   *
	   * �������Ǵ� index=4 Ҳ���� 6����ʼ��index=5�����������ֱȽ�
	   *  6 ���� 5����������Ϊ 1 2 3 4 5 6, ��ʱ index = 4 ��λ�ñ�Ϊ��5
	   *     ����������5��index=6�Ƚ�
	   *  index = 6 �Ѿ������� index < length ������������������ɡ�
	   */
	private static void bubbleDownSort(int[] arr) {
		int len = arr.length;
		if(len <= 1) return;
		
		for(int i = 0; i < len; ++i) {
			for(int j = i + 1; j < len; ++j) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	private static void shellSort(int[] arr) {
		int n = arr.length;
		if(n <= 1) return;
		
		for(int step = n / 2; step >= 1; step /= 2) {
			for(int i = step; i < n; ++i) {
				int temp = arr[i];
				int j = i - step;
				for(; j >= 0; j -= step) {
					if(arr[j] > temp) {
						arr[j + step] = arr[j];
					}else {
						break;
					}
				}
				arr[j + step] = temp;
			}
		    System.out.println("step = " + step + " " + Arrays.toString(arr));
		}
	} 
	
}
