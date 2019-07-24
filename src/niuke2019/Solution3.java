package niuke2019;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/7/24 19:33
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; ++i) {
            strings[i] = scanner.nextLine();
        }

        int res = 1;
        for (int i = 1; i < n; ++i) {
            String devs = strings[i] + strings[i];
            String pres = strings[i - 1];
            int index = 0;
            int j;
            for (j = 0; j < pres.length() && index < devs.length(); index++) {
                if (devs.charAt(index) != pres.charAt(j)) {
                } else {
                    j++;
                }
            }
            if (j != pres.length()) {
                res++;
            }
        }
        System.out.println(res);
    }
}
