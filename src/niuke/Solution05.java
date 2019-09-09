package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 16:38
 */
public class Solution05 {

    /**
     * ����n������ĸ߶ȣ���ʾ����ĳ��n������ĺ��θ߶ȡ�
     * ���㽵��֮��õ����ˮ�����������ڵ�ƽ�ߣ�Ҳ����С��0����һ����ˮ
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] height = new int[n];
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            height[i] = scanner.nextInt();
            if (height[i] < 0) {
                ans += Math.abs(height[i]);
                height[i] = 0;
            }
        }
        scanner.close();
        for (int i = 1; i < n - 1; ++i) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = i; j >= 0; --j) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < n; ++j) {
                maxRight = Math.max(maxRight, height[j]);
            }
            ans += Math.min(maxLeft, maxRight) - height[i];
        }
        System.out.println(ans);
    }
}
