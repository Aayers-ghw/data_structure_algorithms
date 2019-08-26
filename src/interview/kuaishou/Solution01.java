package interview.kuaishou;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 17:01
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        while (--m >= 0) {
            String s = scanner.nextLine();
            String[] str = s.split(" ");
            String[] s1 = str[0].split("\\.");
            String[] s2 = str[1].split("\\.");
            int len = Math.max(s1.length, s2.length);
            for (int i = 0; i < len; ++i) {
                Integer v1 = i < s1.length ? Integer.parseInt(s1[i]) : 0;
                Integer v2 = i < s2.length ? Integer.parseInt(s2[i]) : 0;
                int compare = v2.compareTo(v1);
                if (compare == 1) {
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }
}
