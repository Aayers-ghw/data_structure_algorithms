package interview.shangtang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 19:58
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int f0 = scanner.nextInt();
        int len = (int)(n % 1000000007);
        int[] f = new int[len + 1];
        if (n == 0) {
            System.out.println(f0);
            return;
        }
        f[1] = a * f[0] + 32768;
        if (n == 1) {
            System.out.println(f[1]);
            return;
        }
        f[2] = a * f[1] + b * f[0] + 6 + 32767;
        if (n == 2) {
            System.out.println(f[2]);
            return;
        }
        long j;
        for (j = 3; j <= n; ++j) {
            int i = (int)(j % 1000000007);
            f[i] = (a * f[i - 1] + b * f[i - 2] +
                    c * f[i - 3] + 2 * (int)Math.pow(i, 2) - i + 32767) % 1000000007;
        }
        System.out.println(f[len]);
    }
}
