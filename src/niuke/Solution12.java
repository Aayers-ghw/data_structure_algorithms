package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 16:27
 */
public class Solution12 {

    /**
     * Ȧ���˶��������úܶ�ľ�����ڵ������һ���������0�Ķ���Ρ�
     * <p>
     * С��ϲ��Ȧ���˶�����������ҪȥС���������һЩľ��������Ȧ��һ�������
     * С������սһ��С�������Ը�С��������һЩ�ϰ����ϰ��ֱ��ǣ�
     * 1.���С��Ҫ���i��ľ���Ļ������ͱ����ǰi-1��ľ������������
     * 2.���˵�ľ������������Ȧ���˶��С�
     * ��ô����С����������ٸ�ľ��������ʹ��ľ��Χ�ɵ�ͼ���Ǹ��������0������أ�
     */
    public static void main(String[] args) {
        /**
         * ���⣺����һ�����ݣ��ж�ǰi�������Ƿ��ܹ����ɶ����
         * �����������鳤��С��2�϶��ǲ��ܹ����ɶ���ε�
         * ��i>=3�������£��������ǰi�����ĺ�sum��ȥǰi���������ֵmaxʣ����ܺʹ���sum,����sum-max>max;
         * ����Թ��ɶ���Σ����߲����ԡ�
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println(-1);
            return;
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 2; i < n; ++i) {
            int max = 0;
            int sum = 0;
            for (int j = 0; j <= i; ++j) {
                if (max < nums[j]) {
                    sum += max;
                    max = nums[j];
                } else {
                    sum += nums[j];
                }
            }
            if (max < sum) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
