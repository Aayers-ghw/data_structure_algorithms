package niuke2019;

import java.util.Scanner;

/**
 * 表达式求值
 *
 * @author Aayers-ghw
 * @date 2019/8/2 14:44
 */
public class Solution9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b) {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        if (a > c) {
            a = a ^ c;
            c = a ^ c;
            a = a ^ c;
        }
        if (b > c) {
            b = b ^ c;
            c = b ^ c;
            b = b ^ c;
        }
        int res;
        if (a == 1) {
            res = (a + b) * c;
            System.out.println(res);
        } else {
            res = a * b * c;
            System.out.println(res);
        }
    }
}
