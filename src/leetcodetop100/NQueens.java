package leetcodetop100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Nª ∫ÛŒ Ã‚
 *
 * @author Aayers-ghw
 * @date 2019/8/6 18:54
 */
public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> resultList  = new ArrayList<>();
        if (n < 0) {
            return resultList;
        }
        int[] result = new int[n];
        dfs(resultList, result, 0, n);
        return resultList;
    }

    public static void dfs(List<List<String>> res, int[] result, int row, int n) {
        if (row == n) {
            List<String> list = new LinkedList<>();
            for (int x = 0; x < n; ++x) {
                StringBuilder sb = new StringBuilder();
                for (int y = 0; y < n; ++y) {
                    sb.append(result[x] == y ? "Q" : ".");
                }
                list.add(sb.toString());
            }
            res.add(list);
            return;
        }
        for (int column  = 0; column  < n; ++column ) {
            boolean isValid = true;
            result[row] = column;

            for (int i = row - 1; i >= 0; --i) {
                if (result[i] == column || Math.abs(result[i] - column) == row - i) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                dfs(res, result, row + 1, n);
            }
        }
    }
}
