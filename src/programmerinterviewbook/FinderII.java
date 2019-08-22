package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 21:16
 */
public class FinderII {

    public int findElement(int[] A, int n, int x) {
        // write code here
        if (A == null || A.length == 0) {
            return -1;
        }
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (x == A[mid]) {
                return mid;
            }
            //ǰ�������
            if (A[left] < A[mid]) {
                //�ж�target�Ƿ���ǰ��Σ�����ڣ����������ǰ��Σ�������ڣ��������������
                if (A[left] <= x && x < A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {//else˵����������
                if (A[mid] < x && x <= A[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
