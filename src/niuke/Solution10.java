package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 11:15
 */
public class Solution10 {

    /**
     * 八皇后问题，是一个古老而著名的问题。
     * 该问题是国际西洋棋棋手马克斯·贝瑟尔于1848年提出：在8×8格的国际象棋上摆放八个皇后，使其不能互相攻击，
     * 即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
     * 利用回溯算法我们能很快的得到共有92种互不相同的解（独立解有12种）。
     * 当棋盘变成n行，n列，且皇后也有n个的时候（n<=20），问有多少种不同的解？
     */
    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] result = new int[n];
        dfs(result, 0, n);
        System.out.println(res);
    }

    private static void dfs(int[] result, int row, int n) {
        if (row == n) {
            res++;
            return;
        }
        for (int column = 0; column < n; ++column) {
            boolean isValid = true;
            result[row] = column;

            for (int i = row - 1; i >= 0; --i) {
                if (result[i] == column || Math.abs(result[i] - column) == row - i) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                dfs(result, row + 1, n);
            }
        }
    }
}
