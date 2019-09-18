package interview.dmai;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/9/18 13:49
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                char top = stack.pop();
                if (ch == ']' && top != '[' || ch == '}' && top != '{' ||ch == ')' && top != '(') {
                    System.out.println(false);
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
