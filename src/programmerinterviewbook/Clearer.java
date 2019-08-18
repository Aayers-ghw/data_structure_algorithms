package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 10:21
 */
public class Clearer {

    /**
     * 请编写一个算法，若N阶方阵中某个元素为0，则将其所在的行与列清零。
     * <p>
     * 给定一个N阶方阵int[][](C++中为vector<vector><int>>)mat和矩阵的阶数n，请返回完成操作后的int[][]方阵
     *
     * @param mat
     * @param n
     * @return
     */
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        if (mat == null || mat.length == 0) {
            return mat;
        }
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < mat.length; ++i) {
            if (mat[0][i] == 0) {
                flag1 = true;
                break;
            }
        }
        for (int j = 0; j < mat[0].length; ++j) {
            if (mat[j][0] == 0) {
                flag2 = true;
                break;
            }
        }
        for (int i = 1; i < mat.length; ++i) {
            for (int j = 1; j < mat[0].length; ++j) {
                if (mat[i][j] == 0) {
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < mat.length; ++i) {
            for (int j = 1; j < mat[0].length; ++j) {
                if (mat[0][j] == 0 || mat[i][0] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if (flag1) {
            for (int i = 0; i < mat.length; ++i) {
                mat[0][i] = 0;
            }
        }
        if (flag2) {
            for (int i = 0; i < mat[0].length; ++i) {
                mat[i][0] = 0;
            }
        }
        return mat;
    }
}
