package interview.huiding;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/26 19:47
 */
public class Solution01 {
    final static String INDEX = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] nums = new int[s.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            nums[i] = s.charAt(i);
            sb.append(DecimalTobinary(nums[i]));
        }
        String tmp = sb.toString();
        for (int i = 0; i < tmp.length(); i += 6) {
            String substring = tmp.substring(i, i + 6);
            int index = binaryToDecimal(substring);
            System.out.print(INDEX.charAt(index));
        }
    }

    private static int binaryToDecimal(String n) {
        int res = 0;
        for (int i = n.length() - 1; i >= 0; --i) {
            res = res * 10 + (n.charAt(i) - '0');
        }
        return res;
    }

    private static String DecimalTobinary(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; ++i) {
            if (n != 0) {
                sb.append(n % 2);
                n /= 2;
            } else {
                sb.append("0");
            }
        }
        return sb.reverse().toString();
    }
}
