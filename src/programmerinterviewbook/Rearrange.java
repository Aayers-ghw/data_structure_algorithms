package programmerinterviewbook;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 10:54
 */
public class Rearrange {

    /**
     * ��һ���������飬���дһ���������ҳ�����m��n��ֻҪ��m��n֮���Ԫ���ź������������������ġ�
     * ע�⣺n-mӦ��ԽСԽ�ã�Ҳ����˵���ҳ�����������������С�
     * <p>
     * ����һ��int����A������Ĵ�Сn���뷵��һ����Ԫ�飬�����������е������յ㡣
     * (ԭ����λ�ô�0��ʼ���,��ԭ�������򣬷���[0,0])����֤A��Ԫ�ؾ�Ϊ��������
     *
     * @param A
     * @param n
     * @return
     */
    public int[] findSegment(int[] A, int n) {
        // write code here
        int[] res = new int[2];
        if (A == null || A.length == 0) {
            return res;
        }
        int[] tmp = new int[n];
        for (int i = 0; i < n; ++i) {
            tmp[i] = A[i];
        }
        Arrays.sort(tmp);
        int start = 0;
        int end = n - 1;
        while (start < n && tmp[start] == A[start]) {
            start++;
        }
        if (start == n) {
            return res;
        }
        while (end >= 0 && tmp[end] == A[end]) {
            end--;
        }
        if (end < 0) {
            return res;
        }
        res[0] = start;
        res[1] = end;
        return res;
    }
}
