package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/11 20:47
 */
public class SurroundedRegions {

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        boolean[][] vis = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1) {
                    help(board, vis, i, j);
                }
            }
        }
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (!vis[i][j] && board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void help(char[][] board, boolean[][] vis, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || vis[i][j] || board[i][j] == 'X') {
            return;
        }
        vis[i][j] = true;
        help(board, vis, i + 1, j);
        help(board, vis, i - 1, j);
        help(board, vis, i, j + 1);
        help(board, vis, i, j - 1);
    }
}
