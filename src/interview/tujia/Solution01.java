package interview.tujia;

import java.util.Scanner;

/**
 * ��ʦס��ϲ�������Ͻ��µ�һ����ׯ��ͻȻһ�죬������ѩ�����ܿ��ׯ��Ҫ�����������˽������ѡ�
 * <p>
 * ��ʦ���ܲ����ٶ�Ϊ13m/s,���������ٶȣ����޷�����ѩ���ġ����ǣ���ʦ���������ܣ�����1s���ƶ�50m,ÿ��ʹ�ü��ܺ󣬻�����10��ħ��ֵ��
 * ħ��ֵ�Ļָ��ٶ�Ϊ4��/s,ֻ����ԭ����Ϣ״̬ʱ���ܹ��ָ���
 * <p>
 * ����֪��ʦ��ʼֵΪM,����λ���밲ȫ����ľ���ΪS,ѩ�������ׯ��ʱ��ΪT��
 * <p>
 * ��дһ�����򣬼��㷨ʦ�������̵�ʱ���ڵ��ﰲȫ�����粻�ܹ����ѣ������ʦ��ʱ�����ߵ���Զ���롣
 *
 * @author Aayers-ghw
 * @date 2019/9/6 21:16
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.next());
        int s = Integer.parseInt(scanner.next());
        int t = Integer.parseInt(scanner.next());
        int dis = 0;
        for (int i = 1; i <= t; ++i) {
            if (m >= 10) {
                dis += 50;
                m -= 10;
            }
            //3.5s���Լӵ�10ħ��ֵ
            else if (t - i > 4) {
                m += 4;
            } else {
                dis += 13;
            }

            if (dis >= s) {
                System.out.println("Yes");
                System.out.println(i);
                return;
            }
        }
        System.out.println("No");
        System.out.println(dis);
    }
}
