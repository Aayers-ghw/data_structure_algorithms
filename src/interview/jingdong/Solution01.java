package interview.jingdong;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/24 19:44
 */
public class Solution01 {

    /**
     * �ϳ��ӵ�N��ѧ��վ��һ���Ҵ����ұ��Ϊ1��N�����б��Ϊi��ѧ�����ΪHi��
     * ���ڽ���Щѧ���ֳ������飨ͬһ���ѧ�����������������ÿ��ѧ�������Ұ���ߴӵ͵��߽������У�
     * ʹ���������ѧ��ͬ�������������ߴӵ͵��ߣ��м�λ�ÿ��Եȸߣ�����ô����ܽ���Щѧ���ֳɶ����飿
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        int cnt = 1;
        int tmp = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > tmp) {
                cnt++;
                tmp = nums[i];
            }
        }
        System.out.println(cnt);
    }
}
