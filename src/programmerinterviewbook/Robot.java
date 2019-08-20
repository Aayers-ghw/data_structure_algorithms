package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 8:48
 */
public class Robot {

    /**
     * ��һ��XxY������һ��������ֻ���߸����ֻ�����һ������ߣ�Ҫ�����Ͻ��ߵ����½ǡ�
     * �����һ���㷨������������ж������߷���
     * <p>
     * ��������������int x,int y���뷵�ػ����˵��߷���Ŀ����֤x��yС�ڵ���12��
     *
     * @param x
     * @param y
     * @return
     */
    public int countWays(int x, int y) {
        // write code here
        int[][] dp = new int[x][y];
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[x - 1][y - 1];
    }
}
