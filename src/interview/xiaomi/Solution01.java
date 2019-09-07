package interview.xiaomi;

import java.util.Scanner;
import java.util.Stack;

/**
 * ����
 * ������ʽ��ʾ�Ķ������ַ��������ַ�1~9��ʾÿ����������ÿ���ڵ㣬�ַ������ظ�ʹ��
 * <p>
 * ���
 * ������������������
 * <p>
 * <p>
 * ��������
 * 1(2(3,4(,5)),6(7,))
 * �������
 * 3245176
 *
 * @author Aayers-ghw
 * @date 2019/9/6 18:49
 */
public class Solution01 {


    /*������������������ʵ����ĿҪ��Ĺ���
    ��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^
    ******************************��ʼд����******************************/
    static String solution(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); ++i) {
            char ch = input.charAt(i);
            switch (ch) {
                case ',': {
                    //��ڵ�
                    if (Character.isDigit(stack.peek())) {
                        sb.append(stack.pop());
                    }
                    //������
                    stack.pop();

                    //���ڵ�
                    if (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    break;
                }
                case ')': {
                    if (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                        sb.append(stack.pop());
                    }
                    break;
                }
                default: {
                    stack.push(input.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    /******************************����д����******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }

        res = solution(_input);
        System.out.println(res);
    }
}