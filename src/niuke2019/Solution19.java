package niuke2019;

import java.util.*;

/**
 * Å£Å£µÄÄÖÖÓ
 *
 * @author Aayers-ghw
 * @date 2019/8/3 19:47
 */
public class Solution19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = 0;
        int m = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            h = scanner.nextInt();
            m = scanner.nextInt();
            a[i] = h * 60 + m;
        }
        int t = scanner.nextInt();
        h = scanner.nextInt();
        m = scanner.nextInt();
        int p = h * 60 + m - t;
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 0; --i) {
            if (a[i] <= p) {
                h = a[i] / 60;
                m = a[i] % 60;
                System.out.println(h + " " + m);
                break;
            }
        }
    }
}
