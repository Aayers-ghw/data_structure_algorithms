package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 8:39
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            int[] tmp = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = tmp;
            left++;
            right--;
        }
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = i; j < matrix[0].length; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
