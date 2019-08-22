package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 14:21
 */
public class Queens {

    /**
     * �����һ���㷨�����������n�ʺ����⡣�����n�ʺ�����ָ��һ��nxn�������Ϸ���n�����ӣ�
     * ʹ��ÿ��ÿ�к�ÿ���Խ����϶�ֻ��һ�����ӣ�����ڷŵķ�������
     *
     * ����һ��int n���뷵�ط���������֤nС�ڵ���15
     * @param n
     * @return
     */
    int ans = 0;
    public int nQueens(int n) {
        // write code here
        if (n < 0) {
            return 0;
        }
        int[] result = new int[n];
        dfs(result, 0, n);
        return ans;
    }

    public void dfs(int[] result, int row, int n) {
        if (row == n) {
            ans++;
            return;
        }
        for (int column = 0; column < n; ++column) {
            boolean isValid = true;
            result[row] = column;
            for (int i = row - 1; i >= 0; --i) {
                if (result[i] == column || Math.abs(result[i] - column) == (row - i)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                dfs(result, row + 1, n);
            }
        }
    }
}
