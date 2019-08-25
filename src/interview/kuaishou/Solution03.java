package interview.kuaishou;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 17:01
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str1 = scanner.nextLine().split(" ");
        String[] str2 = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int j = 0;
        int index = 0;
        for (int i = 0; i < str1.length; ++i) {
            sb.append(str1[i]);
            index++;
            if (j < str2.length && index % 4 == 0) {
                sb.append(str2[j]);
                j++;
            }
        }
        while (j < str2.length) {
            sb.append(str2[j++]);
        }
        String res = sb.toString();
        for (int i = 0; i < res.length(); ++i) {
            if (i != res.length() - 1) {
                System.out.print(res.charAt(i) + " ");
            } else {
                System.out.println(res.charAt(i));
            }
        }
    }
}
