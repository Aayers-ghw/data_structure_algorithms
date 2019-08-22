package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 14:21
 */
public class Queens {

    /**
     * 请设计一种算法，解决著名的n皇后问题。这里的n皇后问题指在一个nxn的棋盘上放置n个棋子，
     * 使得每行每列和每条对角线上都只有一个棋子，求其摆放的方法数。
     *
     * 给定一个int n，请返回方法数，保证n小于等于15
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
