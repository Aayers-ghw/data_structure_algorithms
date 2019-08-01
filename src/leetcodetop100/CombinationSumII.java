package leetcodetop100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/1 8:22
 */
public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        dfs(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> tempList, int[] nums, int target, int start) {
        if (target == 0) {
            res.add(new ArrayList(tempList));
            return;
        }
        for (int i = start; i < nums.length && nums[i] <= target; ++i) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            tempList.add(nums[i]);
            dfs(res, tempList, nums, target - nums[i], i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
