package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 8:51
 */
public class RobotII {

    /**
     * ��һ��XxY������һ��������ֻ���߸����ֻ�����һ������ߣ�Ҫ�����Ͻ��ߵ����½ǡ������һ���㷨������������ж������߷���
     * ע����ε���������Щ�ϰ����ǲ����ߵġ�
     * <p>
     * ����һ��int[][] map(C++ ��Ϊvector >),��ʾ����ͼ����map[i][j]Ϊ1��˵���õ㲻���ϰ��㣬������Ϊ�ϰ���
     * �������int x,int y����ʾ����Ĵ�С���뷵�ػ����˴�(0,0)�ߵ�(x - 1,y - 1)���߷�����
     * Ϊ�˷�ֹ������뽫���Mod 1000000007����֤x��y��С�ڵ���50
     *
     * @param map
     * @param x
     * @param y
     * @return
     */
    public int countWays(int[][] map, int x, int y) {
        // write code here
        int[][] dp = new int[x][y];
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < y; ++j) {
                if (map[i][j] != 1) {
                    continue;
                }
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0 && j != 0) {
                    dp[0][j] = dp[0][j - 1];
                } else if (i != 0 && j == 0) {
                    dp[i][0] = dp[i - 1][0];
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
                }
            }
        }
        return dp[x - 1][y - 1];
    }
}
