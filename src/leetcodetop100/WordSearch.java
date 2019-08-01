package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 12:04
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (dfs(board, word, visited, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, boolean[][] visited, int index, int i, int j) {
        if (index == word.length()) {
            return true;
        }
        if (i >= board.length || i < 0 || j < 0 || j >= board[0].length
                || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        visited[i][j] = true;
        if (dfs(board, word, visited, index + 1, i, j + 1) ||
                dfs(board, word, visited, index + 1, i, j - 1) ||
                dfs(board, word, visited, index + 1, i + 1, j) ||
                dfs(board, word, visited, index + 1, i - 1, j)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
