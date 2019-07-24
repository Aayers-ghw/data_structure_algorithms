package niuke2019;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/7/24 19:13
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();
        int cnt = 0;
        char[] chars = new char[]{'N', 'W', 'S', 'E'};
        for (int i = 0; i < n; ++i) {
            if (string.charAt(i) == 'L') {
                cnt++;
                cnt %= 4;
            } else {
                cnt--;
                cnt %= 4;
            }
        }
        System.out.println(chars[(cnt + 4) % 4]);
    }
}
