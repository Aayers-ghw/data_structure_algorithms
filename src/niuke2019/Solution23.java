package niuke2019;

import java.util.Scanner;

/**
 * 获得特定数量硬币问题
 *
 * @author Aayers-ghw
 * @date 2019/8/6 18:34
 */
public class Solution23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n >= 1) {
            if (n % 2 == 1) {
                n = (n - 1) / 2;
                sb.append("1");
            } else {
                n = (n - 2) / 2;
                sb.append("2");
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
