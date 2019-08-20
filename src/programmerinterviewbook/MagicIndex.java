package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 9:24
 */
public class MagicIndex {

    /**
     * ������A[0..n-1]�У�����ν��ħ����������������A[i]=i������һ���������飬Ԫ��ֵ������ͬ��
     * ��дһ���������ж�������A���Ƿ����ħ����������˼��һ�ָ��Ӷ�����o(n)�ķ�����
     * <p>
     * ����һ��int����A��int n���������С���뷵��һ��bool�������Ƿ����ħ��������
     *
     * @param A
     * @param n
     * @return
     */
    public boolean findMagicIndex(int[] A, int n) {
        // write code here
        if (A == null || A.length == 0) {
            return false;
        }
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (A[mid] == mid) {
                return true;
            }
            if (A[mid] < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
