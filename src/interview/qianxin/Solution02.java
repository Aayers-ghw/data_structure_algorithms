package interview.qianxin;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/9 19:54
 */
public class Solution02 {

    /**
     * ��Ԫ��������1.�����������գ�������ֵ��С�ڸ��ڵ㣻2.�����������գ�������ֵ�����ڸ��ڵ㣻3.�����������Ƕ�Ԫ��������4. û�м�ֵ��ȵĽڵ㣩�����������ڵ��ֵ�����ҳ���������Ĺ������ȡ�
     * <p>
     * ���������У���һ��Ϊ���㼶���ڶ���Ϊ���ڵ㣨����-1��ʾΪ�սڵ㣩��������Ϊ��Ҫ�������ȵ���������
     * <p>
     * ����ͼ�У����߿�û����ʵ�ڵ㣬Ϊ�����뷽���Ӧλ����-1������12��20�����������������Ϊ��
     * <p>
     * 4
     * <p>
     * 9 6 15 2 -1 12 25 -1 -1 -1 -1 -1 -1 20 37
     * <p>
     * 12 20
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            String[] str = scanner.nextLine().split(" ");
            if (str.length == 0) {
                System.out.println(-1);
                break;
            }
            int[] nums = new int[str.length + 1];
            for (int i = 1; i < nums.length; ++i) {
                nums[i] = Integer.parseInt(str[i - 1]);
            }
            int m1 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int cnt = 0;
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] == m1 || nums[i] == m2) {
                    cnt++;
                }
            }
            if (cnt != 2) {
                System.out.println(-1);
                break;
            }
            int index = 1;
            while (--n >= 0) {
                if (nums[index] == -1) {
                    System.out.println(-1);
                    break;
                }
                if (nums[index] == m1 || nums[index] == m2) {
                    System.out.println(nums[index]);
                    break;
                }
                if (nums[index] > Math.min(m1, m2) && nums[index] < Math.max(m1, m2)) {
                    System.out.println(nums[index]);
                    break;
                }
                if (nums[index] < Math.min(m1, m2)) {
                    index = index * 2 + 1;
                } else {
                    index = index * 2;
                }
            }
            System.out.println(-1);
        }
    }
}
