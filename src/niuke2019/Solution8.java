package niuke2019;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 21:13
 */
public class Solution8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int k = input.nextInt();
            int res = 0;
            for (int i = 0; i <= n; ++i) {
                for (int j = 0; j <=n; ++j) {
                    if (j == 0) {
                        continue;
                    }
                    if (i % j >= k) {
                        res++;
                        System.out.println("(" + i + "," + j + ")");
                    }
                }
            }
            System.out.println(res);
        }
    }
}
