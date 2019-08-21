package programmerinterviewbook;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/21 9:36
 */
public class Parenthesis {

    /**
     * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
     * <p>
     * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
     *
     * @param A
     * @param n
     * @return
     */
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if (A == null || A.length() == 0) {
            return false;
        }
        char[] chars = A.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (ch == '(') {
                stack.push('(');
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
