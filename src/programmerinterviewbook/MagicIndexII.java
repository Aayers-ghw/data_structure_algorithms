package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 9:38
 */
public class MagicIndexII {

    /**
     * ������A[0..n-1]�У�����ν��ħ����������������A[i]=i������һ�����½����У�
     * Ԫ��ֵ������ͬ����дһ���������ж�������A���Ƿ����ħ����������˼��һ�ָ��Ӷ�����o(n)�ķ�����
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
        for (int i = 0; i < n; ) {
            if (A[i] == i) {
                return true;
            } else {
                if (A[i] < i) {
                    i++;
                } else {
                    i = A[i];
                }
            }
        }
        return false;
    }
}
