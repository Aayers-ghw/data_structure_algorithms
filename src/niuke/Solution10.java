package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 11:15
 */
public class Solution10 {

    /**
     * �˻ʺ����⣬��һ�����϶����������⡣
     * �������ǹ����������������˹����ɪ����1848���������8��8��Ĺ��������ϰڷŰ˸��ʺ�ʹ�䲻�ܻ��๥����
     * �����������ʺ󶼲��ܴ���ͬһ�С�ͬһ�л�ͬһб���ϣ����ж����ְڷ���
     * ���û����㷨�����ܺܿ�ĵõ�����92�ֻ�����ͬ�Ľ⣨��������12�֣���
     * �����̱��n�У�n�У��һʺ�Ҳ��n����ʱ��n<=20�������ж����ֲ�ͬ�Ľ⣿
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
