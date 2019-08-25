package interview.kuaishou;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 17:01
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while (--m >= 0) {
            int n = scanner.nextInt();
            if (help(n)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }

    public static boolean help(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        int sum;
        do {
            sum = 0;
            while (n != 0) {
                int tmp = n % 10;
                sum += tmp * tmp;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        } while (set.add(sum));
        return false;
    }
}
