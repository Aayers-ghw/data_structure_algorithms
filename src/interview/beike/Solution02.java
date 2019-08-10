package interview.beike;

import java.util.Scanner;

/**
 * ��Ŀ������
 * СϣżȻ�õ��˴�˵�е��¹ⱦ��,Ȼ�����¹ⱦ����Ҫһ�����롣
 * ��ȻСϣ����֪�����������ʲô�������¹ⱦ�е�˵����������һ��
 * ����Ϊ n (2 <= N <= 50000)������ a (-10^9 <= a[i] <= 10^9)�ķ�Χ�ڡ�
 * ����д��һ�λ���������������е�����ϸ����������еĳ���(�ϸ�������������ָ��
 * �����е�Ԫ�����ϸ�����ģ�����: [5,1,6,2,4]����ϸ�����������Ϊ[1,2,4])��
 * �����Сϣ�ҵ�������롣
 * <p>
 * ���룺
 * ��1�У�1����N��NΪ���еĳ���(2<=N<=50000)
 * <p>
 * ��2�� N+1�У�ÿ��1��������Ӧ���е�Ԫ��(-10^9 <= a[i] <= 10^9)
 * <p>
 * �����
 * һ����������ʾ�ϸ�����������еĳ���
 *
 * @author Aayers-ghw
 * @date 2019/8/10 19:17
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) {
                nums[i] = scanner.nextInt();
            }
            int res = 0;

            int[] dp = new int[n];
            dp[0] = 1;
            for (int i = 1; i < n; ++i) {
                int j;
                for (j = i - 1; j >= 0; --j) {
                    boolean flag = nums[j] < nums[i];
                    if (flag) {
                        break;
                    }
                }
                if (j == -1) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[j] + 1;
                }
                res = Math.max(res, dp[i]);
            }
            System.out.println(res);
        }
    }
}
