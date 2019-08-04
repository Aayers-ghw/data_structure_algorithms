package interview.dajiang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 20:07
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int p =scanner.nextInt();
            int c = scanner.nextInt();
            int[][] nums = new int[p][3];
            for (int i = 0; i < p; ++i) {
                for (int j = 0; j < 3; ++j) {
                    nums[i][j] = scanner.nextInt();
                }
            }
        }
    }
}
