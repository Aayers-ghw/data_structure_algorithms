package interview.tongcheng.zhuanzhuan;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/21 18:39
 */
public class Solution01 {

    private static String str = "0123456789`!@#$%^&*(){}\\<>?";

    /**
     * 十进制转27进制
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        StringBuilder sb = new StringBuilder();
        long tmp;
        while (n != 0) {
            tmp = n % 27;
            sb.append(str.charAt((int)tmp));
            n /= 27;
        }
        System.out.println(sb.reverse().toString());
    }
}
