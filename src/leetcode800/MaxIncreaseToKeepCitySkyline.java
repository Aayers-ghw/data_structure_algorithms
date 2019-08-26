package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/8/26 14:05
 */
public class MaxIncreaseToKeepCitySkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }
        int res = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                res += Math.min(row[i] - grid[i][j], col[j] - grid[i][j]);
            }
        }
        return res;
    }
}
