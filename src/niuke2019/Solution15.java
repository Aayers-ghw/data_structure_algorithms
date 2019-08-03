package niuke2019;

import java.util.Scanner;

/**
 * ×Ö·ûÃÔÕó
 *
 * @author Aayers-ghw
 * @date 2019/8/3 12:44
 */
public class Solution15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int k = 0; k < t; ++k) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.nextLine();
            char[][] nums = new char[m][n];
            for (int i = 0; i < m; ++i) {
                nums[i] = scanner.nextLine().toCharArray();
            }
            String word = scanner.nextLine();
            int ans = 0;
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    ans += help(nums, i, j, word);
                }
            }
            System.out.println(ans);
        }
    }

    private static int help(char[][] nums, int i, int j, String word) {
        int count = 0;
        if (j + word.length() - 1 < nums[0].length) {
            count += right(nums, i, j, word);
        }
        if (i + word.length() - 1 < nums.length) {
            count += down(nums, i, j, word);
        }
        if (j + word.length() - 1 < nums[0].length && i + word.length() - 1 < nums.length) {
            count += rightDown(nums, i, j, word);
        }
        return count;
    }

    private static int right(char[][] nums, int i, int j, String word) {
        for (int k = 0; k < word.length(); ++k) {
            if (nums[i][j + k] != word.charAt(k)) {
                return 0;
            }
        }
        return 1;
    }

    private static int down(char[][] nums, int i, int j, String word) {
        for (int k = 0; k < word.length(); ++k) {
            if (nums[i + k][j] != word.charAt(k)) {
                return 0;
            }
        }
        return 1;
    }

    private static int rightDown(char[][] nums, int i, int j, String word) {
        for (int k = 0; k < word.length(); ++k) {
            if (nums[i + k][j + k] != word.charAt(k)) {
                return 0;
            }
        }
        return 1;
    }
}
