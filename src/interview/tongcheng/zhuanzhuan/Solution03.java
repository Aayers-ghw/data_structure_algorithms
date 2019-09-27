package interview.tongcheng.zhuanzhuan;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/21 18:39
 */
public class Solution03 {

    private static final String string = "MASK";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("\\@");
        String first = str[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < first.length(); ++i) {
            sb.append(first.charAt(i));
            if (i != first.length() - 1) {
                sb.append(string.charAt(i % 4));
            }
        }
        sb.append("@");
        sb.append(str[1]);
        System.out.println(sb.toString());
    }
}
