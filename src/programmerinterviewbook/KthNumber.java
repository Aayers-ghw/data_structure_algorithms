package programmerinterviewbook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 15:42
 */
public class KthNumber {

    /**
     * ��һЩ����������ֻ��3��5��7�������һ���㷨���ҳ����еĵ�k������
     * <p>
     * ����һ����int k���뷵�ص�k��������֤kС�ڵ���100��
     *
     * @param k
     * @return
     */
    public int findKth(int k) {
        // write code here
        int m3 = 3;
        int m5 = 5;
        int m7 = 7;
        int i3 = 0;
        int i5 = 0;
        int i7 = 0;
        int[] nums = new int[k + 1];
        nums[0] = 1;
        for (int i = 1; i <= k; ++i) {
            nums[i] = Math.min(Math.min(m3 * nums[i3], m5 * nums[i5]), m7 * nums[i7]);
            if (nums[i] == m3 * nums[i3]) {
                i3++;
            }
            if (nums[i] == m5 * nums[i5]) {
                i5++;
            }
            if (nums[i] == m7 * nums[i7]) {
                i7++;
            }
        }
        return nums[k];
    }
}
