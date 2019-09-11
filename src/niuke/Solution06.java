package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 9:58
 */
public class Solution06 {
    /**
     * 给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。
     *
     * 你可以对一个单词进行如下三种操作：
     *
     * 插入一个字符
     * 删除一个字符
     * 替换一个字符
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
