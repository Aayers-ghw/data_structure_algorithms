package interviewtop;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 15:13
 */
public class StringToInteger {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        char firstChar = str.charAt(0);
        long sum = 0;
        int start = 0;
        int sign = 1;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }
        for (int i = start; i < str.length(); ++i) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) sum * sign;
            }
            sum = sum * 10 + str.charAt(i) - '0';
            if (sum > Integer.MAX_VALUE && sign == 1) {
                return Integer.MAX_VALUE;
            }
            if (-sum < Integer.MIN_VALUE && sign == -1) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) sum * sign;
    }
}

