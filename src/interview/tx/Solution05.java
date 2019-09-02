package interview.tx;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/1 20:33
 */
public class Solution05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int k = scanner.nextInt();
        while (--t >= 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int res = b - a + 1;
            if (a == b && a % k == 0) {
                for (int i = k; i <= a; i += k) {
                    int sum = 1;
                    for (int j = (a - k) + 1; j >= 1; --j) {
                        sum = (sum * j) % (1000000007);
                    }
                    if (i == k) {
                        res++;
                    } else {
                        int ll = 1;
                        for (int i1 = 1; i1 <= (i); ++i1) {
                            ll = (ll * i1) % (1000000007);
                        }
                        res = (res + sum / ll) % (1000000007);
                    }
                }
                System.out.println(res);
                return;
            }
            for (int i = a; i <= b; ++i) {
                for (int tmp = k; tmp <= i; tmp += k) {
                    int sum = 1;
                    for (int j = (i - tmp) + 1; j >= 1; --j) {
                        sum = (sum * j) % (1000000007);
                    }
                    if (i == k) {
                        res++;
                    } else {
                        int ll = 1;
                        for (int i1 = 1; i1 <= (i - tmp); ++i1) {
                            ll = (ll * i1) % (1000000007);
                        }
                        res = (res + sum / ll) % (1000000007);
                    }
                }
            }
            System.out.println(res);
        }
    }
}
