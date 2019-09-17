package interview.baidu;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/17 18:57
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        long min = Integer.MAX_VALUE;
        for (int a = 0; a < 1000; ++a) {
            for (int b = 0; b < 1000; ++b) {
                boolean flag = (n - a) * (m - b) <= k;
                if (flag) {
                    min = Math.min(min, a + b);
                }
            }
        }
        System.out.println(min);
    }
}
