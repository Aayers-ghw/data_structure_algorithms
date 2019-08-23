package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 11:07
 */
public class Board {

    /**
     * 对于一个给定的井字棋棋盘，请设计一个高效算法判断当前玩家是否获胜。
     * <p>
     * 给定一个二维数组board，代表当前棋盘，其中元素为1的代表是当前玩家的棋子，为0表示没有棋子，为-1代表是对方玩家的棋子。
     *
     * @param board
     * @return
     */
    public boolean checkWon(int[][] board) {
        // write code here
        if (board[0][0] + board[1][1] + board[2][2] == 3) {
            return true;
        }
        if (board[0][2] + board[1][1] + board[2][0] == 3) {
            return true;
        }
        for (int i = 0; i < 3; ++i) {
            if (board[i][0] + board[i][1] + board[i][2] == 3) {
                return true;
            }
            if (board[0][i] + board[1][i] + board[2][i] == 3) {
                return true;
            }
        }
        return false;
    }
}
