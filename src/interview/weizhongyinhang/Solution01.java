package interview.weizhongyinhang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/19 17:34
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; ++i) {
            sum *= i;
        }
        while (true) {
            if (sum % 10 != 0) {
                System.out.println(sum % 10);
                return;
            } else {
                sum /= 10;
            }
        }
    }
}
