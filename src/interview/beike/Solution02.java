package interview.beike;

import java.util.Scanner;

/**
 * 题目描述：
 * 小希偶然得到了传说中的月光宝盒,然而打开月光宝盒需要一串密码。
 * 虽然小希并不知道密码具体是什么，但是月光宝盒的说明书上有着一个
 * 长度为 n (2 <= N <= 50000)的序列 a (-10^9 <= a[i] <= 10^9)的范围内。
 * 下面写着一段话：密码是这个序列的最长的严格上升子序列的长度(严格上升子序列是指，
 * 子序列的元素是严格递增的，例如: [5,1,6,2,4]的最长严格上升子序列为[1,2,4])，
 * 请你帮小希找到这个密码。
 * <p>
 * 输入：
 * 第1行：1个数N，N为序列的长度(2<=N<=50000)
 * <p>
 * 第2到 N+1行：每行1个数，对应序列的元素(-10^9 <= a[i] <= 10^9)
 * <p>
 * 输出：
 * 一个正整数表示严格最长上升子序列的长度
 *
 * @author Aayers-ghw
 * @date 2019/8/10 19:17
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) {
                nums[i] = scanner.nextInt();
            }
            int res = 0;

            int[] dp = new int[n];
            dp[0] = 1;
            for (int i = 1; i < n; ++i) {
                int j;
                for (j = i - 1; j >= 0; --j) {
                    boolean flag = nums[j] < nums[i];
                    if (flag) {
                        break;
                    }
                }
                if (j == -1) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[j] + 1;
                }
                res = Math.max(res, dp[i]);
            }
            System.out.println(res);
        }
    }
}
