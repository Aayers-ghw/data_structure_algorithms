package fullpermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 9:33
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        help(res, new ArrayList<>(), nums, 0);
        return res;
    }

    public void help(List<List<Integer>> res, List<Integer> list, int[] nums, int start) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; ++i) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            help(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
