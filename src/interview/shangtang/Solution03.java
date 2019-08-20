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

        if (n < 0) {
            System.out.println(0);
            return;
        }
        long[] f = new long[4];
        f[0] = f0;
        f[1] = a * f[0] + 32768;
        f[2] = a * f[1] + b * f[0] + 6 + 32767;
        for (int i = 3; i <= n; ++i) {
            int index = i % 4;
            long f1 = f[(i - 1) % 4];
            long f2 = f[(i - 2) % 4];
            long f3 = f[(i - 3) % 4];
            f[index] = (a * f1 + b * f2 + c * f3 + 2 * i * i - i + 32767) % 1000000007;
        }
        long index = n % 4;
        long result = f[(int) index] % 1000000007;
        System.out.println(result);
    }
}
