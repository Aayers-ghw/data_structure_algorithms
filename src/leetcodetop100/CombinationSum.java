package leetcodetop100;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: candidates = [2,3,6,7], target = 7,
 * A solution set is:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 *
 * @author Aayers-ghw
 * @date 2019/7/31 21:44
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        dfs(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> tempList, int[] nums, int target, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList(tempList));
            return;
        }
        for (int i = start; i < nums.length; ++i) {
            tempList.add(nums[i]);
            dfs(res, tempList, nums, target - nums[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new CombinationSum().combinationSum(new int[]{8, 7, 4, 3}, 11);
        System.out.println(lists);
    }
}
