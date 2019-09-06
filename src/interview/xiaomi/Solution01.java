package interview.xiaomi;

import java.util.Scanner;

/**
 * 输入
 * 上述格式表示的二叉树字符串，用字符1~9表示每个二叉树的每个节点，字符可以重复使用
 * <p>
 * 输出
 * 二叉树的中序遍历结果
 * <p>
 * <p>
 * 样例输入
 * 1(2(3,4(,5)),6(7,))
 * 样例输出
 * 3245176
 *
 * @author Aayers-ghw
 * @date 2019/9/6 18:49
 */
public class Solution01 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String solution(String input) {
        return "";

    }

    /******************************结束写代码******************************/


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