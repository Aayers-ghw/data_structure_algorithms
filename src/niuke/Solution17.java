package niuke;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 15:36
 */
public class Solution17 {
    /**
     * һ�����ֶ�����β�������ֱ�ʶ����ʾһ����Ȼ�����ϣ�
     * �������ֶ�[beg, end)��ʾ��beg��end֮���������Ȼ����
     * ����beg����������end��
     *
     * �����ɸ����ֶΣ���Щ���ֶ�֮��������ص���
     * ��ô����Щ���ֶκϲ�ȥ�أ������ٸ��������ֶ�����ʾ��
     *
     * �ϲ�ǰ���������ϰ��������ֲ������仯��
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; ++i) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> res = new ArrayList<>();
        int[] newInterval = nums[0];
        res.add(newInterval);
        for (int i = 1; i < n; ++i) {
            if (nums[i][0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], nums[i][1]);
            } else {
                newInterval = nums[i];
                res.add(newInterval);
            }
        }
        for (int[] i : res) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}
