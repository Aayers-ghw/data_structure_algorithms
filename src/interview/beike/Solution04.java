package interview.beike;

import java.util.Scanner;

/**
 * ��Ŀ������
 * СC����һ������ķ��������ز��ԣ�����һ����������е�����
 * ÿһ��������һ������ֵ��Ϊ�˱�֤�������ȶ�����������е�
 * ���󸺺ɱ��밴���ȵ�����ݼ��Ĺ���(�����������ݼ�Ҳ����)��
 * ����[ 1��2��8��4��3 ]��[ 1��3��5 ]��[ 10 ]��Щ��������ɵģ�
 * ����һЩ������ģ�����[ 1��2��2��1 ]��[ 2��1��2 ]��[ 10��10 ]��
 * ���ڸ���һ��������У�����Զ�����ĸ���ֵ�������ӣ�Ҫ�����������������ĸ���ֵ��
 * ʹ��������������������ʹ��������������С�������ܺ͡�
 * @author Aayers-ghw
 * @date 2019/8/10 19:49
 */
public class Solution04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) {
                scanner.nextInt();
            }
            int res = 0;
            for (int i = 0; i < nums.length; ++i) {
                int count = 0;

                boolean flag = true;
                int leftTemp = nums[i];
                for (int left = i - 1; left >= 0; --left) {
                    if (nums[left] < leftTemp) {
                        leftTemp = nums[left];
                    } else if (nums[left] > leftTemp) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    continue;
                }

                if (i + 1 < nums.length) {
                    int rightTemp = nums[i + 1];
                    for (int right = i + 2; right < nums.length; ++right) {
                        if (rightTemp < nums[right]) {
                            rightTemp = nums[right];
                        } else if (rightTemp > nums[right]) {
                            count += (rightTemp - nums[right]);
                        }
                    }
                }

            }
        }
    }
}
