package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 11:05
 */
public class Solution19 {
    /**
     * ĳ��Գ���� HR ��֯���ȥƯ�������ϣ��μ��Ž���ͬѧ�������ˣ����Ұ����﹫˾���Ⱥ�˳���źö��ˡ� ����Ա��̫�࣬һ����ͳ������£���Ҫ�ֶ�����������㹻�ģ�����������Ҫ��һ��˳���ϳ��������¹������ϳ���˳��
     * �����ͳ�����Ϊ m���Ӷ��׿�ʼ��ÿ m ���˷ֳ�һ��С�飬ÿ��С����һ������ͬʱֻ��һ�����򿪳��Ź�Ա���ϳ��� С��֮�䰴�Ӷ�β������˳�������ϳ���ͬһС�����ȵ���ͬѧ���ϣ����������ϳ���˳��
     * <p>
     * ���磺 Ա���� 8�� ������ 3�� Ա������˳��Ϊ 1 2 3 4 5 6 7 8�� 3����һ��С�飬������С�飬 С��һ�� 1�� 2�� 3�� С����� 4�� 5�� 6��С������ 7��8�� С���ϳ�˳��Ϊ�� С������С�����С��һ �� ����Ա���ϳ�˳��Ϊ 7 8 4 5 6 1 2 3
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }
        int groupNum = n % m == 0 ? n / m : n / m + 1;
        for (int i = groupNum - 1; i >= 0; --i) {
            if (i == groupNum - 1) {
                for (int j = i * m; j >= 0 && j < n; ++j) {
                    System.out.print(nums[j] + " ");
                }
            } else {
                for (int j = i * m; j < (i + 1) * m; ++j) {
                    if (j == m - 1) {
                        System.out.print(nums[j] + "");
                    } else {
                        System.out.print(nums[j] + " ");
                    }
                }
            }
        }
    }
}
