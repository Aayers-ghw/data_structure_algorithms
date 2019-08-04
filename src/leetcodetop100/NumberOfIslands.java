package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 15:04
 */
public class NumberOfIslands {

    static int res;

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        res = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (dfs(grid, i, j)) {
                    res++;
                }
            }
        }
        return res;
    }

    private static boolean dfs(char[][] grid, int i, int j) {
        boolean flag = i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0';
        if (flag) {
            return false;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        return true;
    }
}
