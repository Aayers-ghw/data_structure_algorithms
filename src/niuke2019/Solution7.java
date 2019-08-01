package niuke2019;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 20:53
 */
public class Solution7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            int res = 0;
            int m = input.nextInt();
            input.nextLine();
            String s = input.nextLine();
            for (int j = 0; j < m; ++j) {
                if (s.charAt(j) == '.') {
                    res++;
                    j += 2;
                }
            }
            System.out.println(res);
        }
    }
}
