package interview.huanjushidai;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 18:58
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(scanner.nextLine());
        }
        String str = sb.toString();
        m %= n;
        if (m < 0) {
            for (int i = 0; i < str.length(); ++i) {
                System.out.print(str.charAt(i));
                if (i != str.length() - 1) {
                    System.out.print(" ");
                }
            }
            return;
        }
        String res = str.substring(m) + str.substring(0, m);
        for (int i = 0; i < res.length(); ++i) {
            System.out.print(str.charAt(i));
            if (i != str.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}
