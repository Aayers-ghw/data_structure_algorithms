package interview.shangtang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 20:44
 */
public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> res = new ArrayList<>();
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        dfs(nums, new ArrayList<>(), res, 0);
        System.out.println(res);
    }

    public static void dfs(int[] nums, List<Integer> list, List<List<Integer>> res, int start) {
        if (start == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[start]);
        for (int i = 0; i < nums.length; ++i) {
            swap(nums, start, i);
            dfs(nums, list, res, start + 1);
            swap(nums, i, start);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
