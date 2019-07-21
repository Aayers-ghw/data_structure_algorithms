package bsearch;

public class Bsearch {

	//��򵥵Ķ��ֲ���
	public static int bsearch(int[] a, int n, int value) {
		int low = 0;
		int hight = n - 1;
		
		while(low <= hight) {
			int mid = low + ((hight - low) / 2);
			if(a[mid] == value) {
				return value;
			}else if(a[mid] > value) {
				hight = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	//���ҵ�һ��ֵ���ڸ���ֵ��Ԫ��
	public static int bsearch_1(int[] a, int n, int value) {
		int low = 0;
		int hight = n - 1;
		
		while(low <= hight) {
			int mid = low + ((hight - low) >> 1);
			if(a[mid] > value) {
				hight = mid - 1;
			}else if(a[mid] < value) {
				low = mid + 1;
			}else {
				if(mid == 0 || a[mid - 1] < value) return a[mid];
				hight = mid - 1;
			}
		}
		return -1;
	}

	
	//�������һ��ֵ���ڸ���ֵ��Ԫ��
	public static int bsearch_2(int[] a, int n, int value) {
		int low = 0;
		int hight = n - 1;
		
		while(low <= hight) {
			int mid = low + ((hight - low) >> 1);
			if(a[mid] > value) {
				hight = mid - 1;
			}else if(a[mid] < value) {
				low = mid + 1;
			}else {
				if(mid == n - 1 || a[mid + 1] > value) return a[mid];
				low = mid + 1;
			}
		}
		return -1;
	}
	
	//���ҵ�һ�����ڵ��ڸ���ֵ��Ԫ��
	public static int bsearch_3(int[] a, int n, int value) {
		int low = 0;
		int hight = n - 1;
		
		while(low <= hight) {
			int mid = low + ((hight - low) >> 1);
			if(a[mid] >= value) {
				if(mid == 0 || a[mid - 1] < value) return a[mid];
				hight = mid - 1;
			}else if(a[mid] < value) {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	//�������һ��С�ڵ��ڸ���ֵ��Ԫ��
	public static int bsearch_4(int[] a, int n, int value) {
		int low = 0;
		int hight = n - 1;
		
		while(low <= hight) {
			int mid = low + ((hight - low) >> 1);
			if(a[mid] <= value) {
				if(mid == n - 1 || a[mid + 1] > value) return a[mid];
				low = mid + 1;
			}else if(a[mid] > value) {
				hight = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5,6};
		System.out.println(bsearch_2(a, 5, 5));
	}
}
