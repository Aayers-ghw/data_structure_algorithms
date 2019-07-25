package niuke2019;

/**
 * 01二维矩阵中最大全为1的正方形maxSquare
 *
 * @author Aayers-ghw
 * @date 2019/7/25 20:56
 */
public class Solution6 {

    public static int maxSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int res = 0;
        for (int i = 0; i < m; ++i) {
            if (matrix[i][0] == 1) {
                dp[i][0] = 1;
                res = 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (matrix[0][i] == 1) {
                dp[0][i] = 1;
                res = 1;
            }
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j])) + 1;
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] m = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}};

        System.out.println(maxSquare(m));
    }
}
