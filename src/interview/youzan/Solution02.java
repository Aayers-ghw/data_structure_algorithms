package interview.youzan;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 15:55
 */
public class Solution02 {

    /**
     * n变为1所需要的最小替换次数
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        System.out.println(integerReplacement(n));
    }

    public static int integerReplacement(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + integerReplacement(n / 2);
        } else {
            return 2 + Math.min(integerReplacement((n / 2) + 1), integerReplacement((n / 2)));
        }
    }
}
