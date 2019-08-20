package fullpermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定可能包含重复项的数字集合，返回所有可能的唯一排列。
 *
 * @author Aayers-ghw
 * @date 2019/8/20 13:58
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        backtrack(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < nums.length; ++i) {
                // 当前位置的数已经在List中了
                if (used[i]) {
                    continue;
                }
                // 当前元素与其前一个元素值相同 且 前元素未被加到list中，跳过该元素
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                list.add(nums[i]);
                backtrack(res, list, nums, used);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
