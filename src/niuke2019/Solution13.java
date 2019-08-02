package niuke2019;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/2 19:34
 */
public class Solution13 {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[m + n];
        int[] b = new int[m];
        for (int i = 0; i < n; ++i) {
            int di = scanner.nextInt();
            int pi = scanner.nextInt();
            a[i] = di;
            map.put(di, pi);
        }
        for (int i = 0; i < m; ++i) {
            int ai = scanner.nextInt();
            a[n + i] = ai;
            b[i] = ai;
            if (!map.containsKey(ai)) {
                map.put(ai, 0);
            }
        }
        int max = Integer.MIN_VALUE;
        Arrays.sort(a);
        for (int i = 0; i < m + n; ++i) {
            max = Math.max(max, map.get(a[i]));
            map.put(a[i], max);
        }
        for (int i = 0; i < m; ++i) {
            System.out.println(map.get(b[i]));
        }
    }
}
