package leetcodetop100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/7/31 19:16
 */
public class SubsetsII {


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        help(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private static void help(List<List<Integer>> res, List<Integer> tmp, int[] nums, int start) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; ++i) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            tmp.add(nums[i]);
            help(res, tmp, nums, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> subsets = subsets(new int[]{4, 4, 4, 1, 4});
        System.out.println(subsets);
    }
}
