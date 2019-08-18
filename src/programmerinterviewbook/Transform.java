package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 10:10
 */
public class Transform {

    /**
     * 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，请编写一个算法，
     * 在不占用额外内存空间的情况下(即不使用缓存矩阵)，将图像顺时针旋转90度。
     * <p>
     * 给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于500，图像元素小于等于256。
     *
     * @param mat
     * @param n
     * @return
     */
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        if (n < 2) {
            return mat;
        }
        int start = 0;
        int end = mat.length - 1;
        while (start < end) {
            int[] tmp = mat[start];
            mat[start] = mat[end];
            mat[end] = tmp;
            start++;
            end--;
        }
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[0].length; ++j) {
                if (i < j) {
                    int tmp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = tmp;
                }
            }
        }
        return mat;
    }
}
