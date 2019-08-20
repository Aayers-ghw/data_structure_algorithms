package interview.bilibili;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 18:55
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; --i) {
            if (str.charAt(i) != ' ') {
                tmp.append(str.charAt(i));
            } else {
                sb.append(tmp.reverse()).append(" ");
                tmp = new StringBuilder();
            }
        }
        sb.append(tmp.reverse());
        System.out.println(sb.toString());
    }

}
