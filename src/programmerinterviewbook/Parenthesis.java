package programmerinterviewbook;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/21 9:36
 */
public class Parenthesis {

    /**
     * ����һ���ַ����������һ���㷨���ж����Ƿ�Ϊһ���Ϸ������Ŵ���
     * <p>
     * ����һ���ַ���A�����ĳ���n���뷵��һ��boolֵ�������Ƿ�Ϊһ���Ϸ������Ŵ���
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
