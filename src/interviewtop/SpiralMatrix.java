package interviewtop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/11 10:16
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return res;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int start = 0;
        while (rows > 2 * start && columns > 2 * start) {
            printMatrix(matrix, res, rows, columns, start);
            start++;
        }
        return res;
    }

    public void printMatrix(int[][] matrix, List<Integer> res, int rows, int columns, int start) {
        int endX = columns - start - 1;
        int endY = rows - start - 1;
        //从左往右
        for (int i = start; i <= endX; ++i) {
            res.add(matrix[start][i]);
        }
        //从上往下
        if (endY - start > 0) {
            for (int i = start + 1; i <= endY; ++i) {
                res.add(matrix[i][endX]);
            }
        }
        //从右往左
        if (endY - start > 0 && endX - start > 0) {
            for (int i = endX - 1; i >= start; --i) {
                res.add(matrix[endY][i]);
            }
        }
        //从下往上
        if (endX - start > 0 && endY - start > 1) {
            for (int i = endY - 1; i > start; --i) {
                res.add(matrix[i][start]);
            }
        }
    }
}
