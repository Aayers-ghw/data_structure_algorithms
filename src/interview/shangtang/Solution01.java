package interview.shangtang;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 19:43
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length; ++i) {
            if ("+".equals(str[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if ("-".equals(str[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if ("*".equals(str[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);
            } else if ("/".equals(str[i])) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(str[i]));
            }
        }
        System.out.println(stack.pop());
    }
}
