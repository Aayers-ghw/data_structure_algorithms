package programmerinterviewbook;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 8:44
 */
public class Stack {

    /**
     * ���޺���һ����������Ϸ����Ϸ��һ����Ҫվ����һ���˵ļ���ϡ�ͬʱ����Ӧ����������˱�������˸���һ�㡣
     * ��֪�μ���Ϸ��ÿ���˵���ߣ����д�������ͨ��ѡ�������Ϸ���ˣ���������ܵ����ٸ��ˡ�
     * ע��������˶����Ⱥ󵽵ģ���ζ�Ųμ���Ϸ���˵��Ⱥ�˳����ԭ�����е�˳��Ӧ��һ�¡�
     * <p>
     * ����һ��int����men��������������ÿ���˵���ߡ�ͬʱ����������n���뷵������ܵ�����������֤nС�ڵ���500��
     *
     * @param men
     * @param n
     * @return
     */
    public int getHeight(int[] men, int n) {
        // write code here
        if (men == null || men.length == 0) {
            return -1;
        }
        int res = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; ++i) {
            dp[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (men[i] >= men[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
}
