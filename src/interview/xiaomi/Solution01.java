package interview.xiaomi;

import java.util.Scanner;

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
        return "";

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