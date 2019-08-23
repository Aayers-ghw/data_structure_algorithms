package programmerinterviewbook;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 9:51
 */
public class StackII {

    /**
     * ���޺���һ����������Ϸ����Ϸ��һ����Ҫվ����һ���˵ļ���ϡ�
     * Ϊ��ʹ���ɵ��޺����ȹ̣�����Ӧ����������˱�������˸���һ�㡣
     * ����һ����Ϸ��Ҫ���������Ŀ��Ϊ���Ӿ�Ч�������ǻ�Ҫ��������˵���߱�������˸ߡ�
     * ���дһ���㷨����������ܵ������ˣ�ע������������Ա��ͬʱ���֡�
     * <p>
     * ����һ����άint������actors��ÿ��Ԫ��������ֵ���ֱ����һ����Ա����ߺ����ء�
     * ͬʱ������Ա����n���뷵������ܵ�����������֤������С�ڵ���500��
     *
     * @param actors
     * @param n
     * @return
     */
    public int getHeight(int[][] actors, int n) {
        // write code here
        if (actors == null || actors.length == 0) {
            return -1;
        }
        Arrays.sort(actors, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; ++i) {
            dp[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (actors[i][1] > actors[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
