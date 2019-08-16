package interview.xunfei;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/16 17:57
 */
public class Solution02 {

    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] ss = s.substring(1, s.length() - 1).split(",");
        int[] nums = new int[ss.length];
        for (int i = 0; i < ss.length - 1; ++i) {
            nums[i] = Integer.parseInt(ss[i]);
        }
        dfs(nums, 0, nums.length - 1);
        System.out.println(res);
    }

    public static void dfs(int[] nums, int left, int right) {
        if (left > right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        if (nums[mid] == 19) {
            res = mid + 1;
            return;
        }
        if (nums[mid] > 19) {
            dfs(nums, left, right - 1);
        } else {
            dfs(nums, left + 1, right);
        }
    }
}
