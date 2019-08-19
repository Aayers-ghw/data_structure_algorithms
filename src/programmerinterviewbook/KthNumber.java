package programmerinterviewbook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 15:42
 */
public class KthNumber {

    /**
     * 有一些数的素因子只有3、5、7，请设计一个算法，找出其中的第k个数。
     * <p>
     * 给定一个数int k，请返回第k个数。保证k小于等于100。
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
