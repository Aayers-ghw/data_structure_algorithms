package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 14:53
 */
public class Solution20 {

    /**
     * ���ַ����е�ÿһ���ַ������ǻ��з��������'\0'������һλ��ʦ������źú�Ķ��Ρ�
     * Ҫ�� Y�ֳ�ȥ���ĵ��⣬���°벿�ֵȸߣ����մ����ң����ϵ��½������򡣶�����û�˵Ĳ����ÿո�ռλ��
     * �������ݱ�֤�����ų�һ��������Y�֣�������Ϊ 3k+1 ��k>=1��
     * <p>
     * ����: 7�� x ���ųɶ���Ϊ��Ϊ�˷���˵���������á�-������ո񣩣�
     * x---x
     * -x-x
     * --x
     * --x
     * --x
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        if (str.length() % 3 != 1) {
            return;
        }
        int half = str.length() / 3;
        int row = half * 2 + 1;
        for (int i = 0; i < row; ++i) {

        }
    }
}
