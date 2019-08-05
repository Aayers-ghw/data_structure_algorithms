package leetcodetop100;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/5 16:33
 */
public class DecodeString {

    public static String decodeString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int cnt = 0;
        String res = "";
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isDigit(s.charAt(i))) {
                cnt = cnt * 10 + (s.charAt(i) - '0');
            } else if (s.charAt(i) == '[') {
                countStack.push(cnt);
                cnt = 0;
                resStack.push(res);
                res = "";
            } else if (s.charAt(i) == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder sb = new StringBuilder(resStack.pop());
                for (int j = 0; j < repeatTimes; ++j) {
                    sb.append(res);
                }
                res = sb.toString();
            } else {
                res += s.charAt(i);
            }
        }
        return resStack.isEmpty() ? res : resStack.pop();
    }

    public static void main(String[] args) {
        String s = decodeString("3[a]2[bc]");
        System.out.println(s);
    }
}
