package niuke2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ¶íÂÞË¹·½¿é
 *
 * @author Aayers-ghw
 * @date 2019/8/3 14:26
 */
public class Solution16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < m; ++i) {
            b[i] = scanner.nextInt();
            a[b[i] - 1]++;
        }
        Arrays.sort(a);
        System.out.println(a[0]);
    }
}
