package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 11:07
 */
public class Board {

    /**
     * ����һ�������ľ��������̣������һ����Ч�㷨�жϵ�ǰ����Ƿ��ʤ��
     * <p>
     * ����һ����ά����board������ǰ���̣�����Ԫ��Ϊ1�Ĵ����ǵ�ǰ��ҵ����ӣ�Ϊ0��ʾû�����ӣ�Ϊ-1�����ǶԷ���ҵ����ӡ�
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
