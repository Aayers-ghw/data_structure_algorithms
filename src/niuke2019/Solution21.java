package niuke2019;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

/**
 * Ê±ÖÓ
 *
 * @author Aayers-ghw
 * @date 2019/8/3 20:41
 */
public class Solution21 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            if (chars[0] > '2') {
                chars[0] = '0';
            } else if (chars[0] == '2' && chars[1] > '3') {
                chars[0] = '0';
            }
            if (chars[3] > '5') {
                chars[3] = '0';
            }
            if (chars[6] > '5') {
                chars[6] = '0';
            }
            System.out.println(String.valueOf(chars));
        }
    }
}
