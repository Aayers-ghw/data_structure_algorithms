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
        int end = s;
        s = s - m / 10 * 50;
        double res = m / 10;
        m = m % 10;
        while (s > 0 && res <= t * 1.0) {
            while (s >= 50) {
                s -= 50;
                double tmp = (10 - m) / 4.0;
                m = 0;
                res += tmp + 1;
            }
            s -= 13;
            res++;
        }
        if (res <= t * 1.0) {
            System.out.println("Yes");
            System.out.println((int) (res + 0.5));
            return;
        }
        System.out.println("No");
        System.out.println(end - s);
    }
}
