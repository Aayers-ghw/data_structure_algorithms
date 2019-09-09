package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 16:54
 */
public class Solution04 {

    /**
     * �ж�һ�������������Ƿ���ڳ���Ϊ3�ĵ��������С�����Ҫ��������������O(n)��ʱ�临�ӶȺ�O(1)�Ŀռ临�Ӷȡ���
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for (int num : nums) {
            if (small >= num) {
                small = num;
            } else if (big >= num) {
                big = num;
            } else {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
