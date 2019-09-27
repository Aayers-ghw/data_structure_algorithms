package interview.shengwang;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/9/26 18:43
 */
public class Solution03 {

    public static void main(String[] args) {
        boolean b = new Solution03().chkLegal("[a+b*(5-4)]*{x+b+b*()}");
        System.out.println(b);
    }

    public boolean chkLegal(String A) {
        // write code here
        if (A == null || A.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : A.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (!(ch == '}' || ch == ']' || ch == ')')) {
                    continue;
                }
                if (stack.isEmpty()) {
                    return false;
                }
                char tmp = stack.pop();
                boolean flag = (ch == '}' && tmp != '{') || (ch == ']' && tmp != '[') || (ch == ')' && tmp != '(');
                if (flag) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
