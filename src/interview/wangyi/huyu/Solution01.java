package interview.wangyi.huyu;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/20 16:56
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        if (str.length != 2) {
            return;
        }
        long num1 = Long.parseLong(str[0]);
        long num2 = Long.parseLong(str[1]);
        System.out.println(help1(num1, num2) + " " + help2(num1, num2));
    }

    /**
     * num1和num2的最小公约数
     *
     * @param num1
     * @param num2
     * @return
     */
    private static long help1(long num1, long num2) {
        if (num1 < num2) {
            long tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        long result;
        long tmp = num1 % num2;
        while (tmp != 0) {
            num1 = num2;
            num2 = tmp;
            tmp = num1 % num2;
        }
        result = num2;
        return result;
    }

    private static Long help2(long num1, long num2) {
        long gcd = help1(num1, num2);
        return num1 / gcd * num2 ;
    }
}
