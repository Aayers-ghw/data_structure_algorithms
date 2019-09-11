package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 9:58
 */
public class Solution06 {
    /**
     * ������������ word1 �� word2��������� word1 ת���� word2 ��ʹ�õ����ٲ����� ��
     *
     * ����Զ�һ�����ʽ����������ֲ�����
     *
     * ����һ���ַ�
     * ɾ��һ���ַ�
     * �滻һ���ַ�
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; ++i) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= m; ++i) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
