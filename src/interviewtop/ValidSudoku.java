package interviewtop;

import java.util.HashSet;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 17:12
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !column.add(board[j][i])) {
                    return false;
                }
                // 行号+偏移量
                int rowIndex = i / 3 * 3 + j / 3;
                // 列号+偏移量
                int columnIndex = i % 3 * 3 + j % 3;
                if (board[rowIndex][columnIndex] != '.' && !cube.add(board[rowIndex][columnIndex])) {
                    return false;
                }
            }
        }
        return true;
    }
}
