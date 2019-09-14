package niuke;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 10:47
 */
public class Solution13 {

    /**
     * С����һ����԰����԰����һ����m�仨������ÿһ�仨�����ǲ�һ���ģ�С����1��m�е�һ��������ʾÿһ�仨��
     *
     * ����ϲ��ȥ����Щ������һ��������n�Σ�����n����������������ʲô����ʱ��˳���¼������
     *
     * ��¼��a[i]��ʾ����ʾ��i��������a[i]��仨��
     *
     * С��ܺ��棬����Q������,��[l,r]��ʱ���ڣ�С��һ�����˶��ٶ䲻ͬ�Ļ�����С����Ϊ��æ���������Ļ�������������������ش���Щ���⡣
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            int input = scanner.nextInt();
            nums[i] = input;
        }
        int q = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        while (--q >= 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            for (int i = l; i <= r; ++i) {
                set.add(nums[i - 1]);
            }
            System.out.println(set.size());
            set.clear();
        }
    }
}
