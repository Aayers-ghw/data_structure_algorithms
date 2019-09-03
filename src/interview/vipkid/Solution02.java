package interview.vipkid;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/3 15:53
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        while (n != 0) {
            n = (n - 1) & n;
            res++;
        }
        System.out.println(res);
    }
}
