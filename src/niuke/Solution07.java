package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 10:30
 */
public class Solution07 {
    /**
     * ��ʵ�����ظ����ֵ���������Ķ��ֲ��ҡ�
     * ����������е�һ�����ڵ��ڲ���ֵ��λ�ã���������в�����������������������鳤�ȼ�һ��
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = scanner.nextInt();
        }
        int left = 0;
        int right = n - 1;
        if (nums[n - 1] < target) {
            System.out.println(n + 1);
            return;
        }
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                if (mid == 0 || nums[mid - 1] < target) {
                    System.out.println(mid + 1);
                    return;
                }
                right = mid - 1;
            }
        }
    }
}
