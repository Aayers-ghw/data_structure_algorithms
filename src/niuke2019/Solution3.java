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
        boolean[] booleans = new boolean[n];
        for (int i = 0; i < n; ++i) {
            strings[i] = scanner.nextLine();
            booleans[i] = false;
        }
        int res = 0;
        for (int i = 0; i < n; ++i) {
            if (!booleans[i]) {
                String tt = strings[i] + strings[i];
                for (int j = i + 1; j < n; ++j) {
                    if (!booleans[j]) {
                        if (help(tt, strings[j])) {
                            booleans[j] = true;
                        }
                    }
                }
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean help(String s1, String s2) {
        if (s1.length() != s2.length() * 2) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < s2.length() && j < s1.length()) {
            while (i < s2.length() && j < s1.length() && s2.charAt(i) == s1.charAt(j)) {
                i++;
                j++;
            }
            if (i == s2.length()) {
                return true;
            } else {
                i = 0;
            }
            j++;
        }
        return false;
    }
}
