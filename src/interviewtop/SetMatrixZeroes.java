package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/11 10:37
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        boolean rowZero = false;
        boolean colZero = false;
        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i][0] == 0) {
                rowZero = true;
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; ++i) {
            if (matrix[0][i] == 0) {
                colZero = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; ++i) {
            for (int j = 1; j < matrix[0].length; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; ++i) {
            for (int j = 1; j < matrix[0].length; ++j) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (rowZero) {
            for (int i = 0; i < matrix.length; ++i) {
                matrix[i][0] = 0;
            }
        }
        if (colZero) {
            for (int i = 0; i < matrix[0].length; ++i) {
                matrix[0][i] = 0;
            }
        }
    }
}
