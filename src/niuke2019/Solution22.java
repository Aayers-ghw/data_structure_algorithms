package niuke2019;

import java.util.Scanner;

/**
 * î§Ë¯
 *
 * @author Aayers-ghw
 * @date 2019/8/4 9:17
 */
public class Solution22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            t[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < t.length; ++i) {
            if (t[i] == 0) {
                int sum = 0;
                int j;
                for (j = 0; j < i; ++j) {
                    if (t[j] != 0) {
                        sum += a[j];
                    }
                }
                for (; j < n; ++j) {
                    if (j <= i + k - 1) {
                        sum += a[j];
                    } else if (t[j] != 0) {
                        sum += a[j];
                    }
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
