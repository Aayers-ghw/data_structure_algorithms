package niuke;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 15:36
 */
public class Solution17 {
    /**
     * 一个数字段由首尾两个数字标识，表示一个自然数集合，
     * 比如数字段[beg, end)表示从beg到end之间的所有自然数，
     * 包含beg，但不包含end。
     *
     * 有若干个数字段，这些数字段之间可能有重叠，
     * 怎么把这些数字段合并去重，用最少个数的数字段来表示。
     *
     * 合并前后，整个集合包含的数字不发生变化。
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
