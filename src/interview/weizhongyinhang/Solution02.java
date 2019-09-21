package interview.weizhongyinhang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/19 17:43
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= n; ++i) {
            res *= i;
        }
        System.out.println(res);
    }
}
