package interview.wangyi.huyu;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/20 16:58
 */
public class Solution03 {

    static double res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int n = scanner.nextInt();
        double[][] nums = new double[n][2];
        scanner.nextLine();
        for (int i = 0; i < n; ++i) {
            String[] str = scanner.nextLine().split(",");
            nums[i][0] = Double.parseDouble(str[0]);
            nums[i][1] = Double.parseDouble(str[1]);
        }

        System.out.println(String.format("%.4f", res));
    }

    private static void dfs(int[][] nums, List<LinkedHashMap> list, int start, int total) {
        if (total < 0) {
            return;
        }
        if (start == nums.length) {
            double tmp = 0;
            for (int i = 0; i < nums.length; ++i) {
                LinkedHashMap linkedHashMap = list.get(i);
                Set set = linkedHashMap.entrySet();

            }
        }
        for (int i = start; i < nums.length; ++i) {
            if (total < nums[i][1] || nums[i][0] <= 0) {
                continue;
            }
            list.add((LinkedHashMap) new LinkedHashMap().put(nums[i][0], nums[i][1]));
            dfs(nums, list, i + 1, total - nums[i][0]);
        }
    }
}
