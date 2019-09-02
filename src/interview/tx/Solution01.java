package interview.tx;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/1 20:01
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //宝箱的数量
        int n = scanner.nextInt();
        //钥匙的数量
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; ++i) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(b);
        int res = 0;
        boolean[] flagB = new boolean[m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (!flagB[j]) {
                    if (a[i] + b[j] % 2 == 1) {
                        flagB[j] = true;
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
