package interview.disifanshi;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/7/31 19:50
 */
public class Main {
    static int maxLength ;
    static int start;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            maxLength = 0;
            start = 0;
            String s = input.nextLine();
            for (int i = 0; i < s.length(); ++i) {
                help(s, i, i);
                help(s, i, i + 1);
            }
            String result = s.substring(start, start + maxLength);
            System.out.println(result);
        }
    }

    private static void help(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxLength < right - left - 1) {
            maxLength = right - left - 1;
            start = left + 1;
        }
    }
}
