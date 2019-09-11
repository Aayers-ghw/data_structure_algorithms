package interview.meituan;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/11 15:54
 */
public class Solution02 {

    public static void main(String[] args) {
        ThreadLocal
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = false;
        for (int i = 1; i <= n; ++i) {
            if (i % 2 == 1) {
                System.out.print("A");
            } else {
                if (!flag) {
                    System.out.print("B");
                    flag = true;
                } else {
                    System.out.print("C");
                    flag = false;
                }
            }
        }
    }
}
