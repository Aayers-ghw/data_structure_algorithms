package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 14:26
 */
public class Solution15 {
    /**
     * ��K����ɫ��С��(K<=10)��ÿ��С�������ɸ�������С��100����
     * ������һ��С���ӣ��ܷ�N��С��(N<=8)������Ҫ����ЩС��������N��С�򣬷������ӡ�
     * ��֪������Щ��ѡ��ʽ��ע��ÿ����ɫ��С��֮��û�в��
     * <p>
     * �밴���ֵ���˳�������ѡС������з�ʽ��
     * <p>
     * ����3����ɫ��ÿ����ɫС��ĸ����ֱ�Ϊa:1,b:2,c:3������3��С��������У�
     * 003,012,021,102,111,120
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums = new int[k];
        for (int i = 0; i < k; ++i) {
            nums[i] = scanner.nextInt();
        }
        List<String> res = new ArrayList<>();
        help(res, n, 0, nums, "");
        res.forEach(System.out::println);
    }

    private static void help(List<String> res, int n, int start, int[] nums, String s) {
        if (n == 0 && start == nums.length) {
            res.add(s);
            return;
        }
        if (start == nums.length) {
            return;
        }
        for (int i = 0; i <= Math.min(n, nums[start]); ++i) {
            help(res, n - i, start + 1, nums, s + i);
        }
    }
}
