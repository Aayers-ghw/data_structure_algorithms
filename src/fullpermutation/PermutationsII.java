package fullpermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * �������ܰ����ظ�������ּ��ϣ��������п��ܵ�Ψһ���С�
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
                // ��ǰλ�õ����Ѿ���List����
                if (used[i]) {
                    continue;
                }
                // ��ǰԪ������ǰһ��Ԫ��ֵ��ͬ �� ǰԪ��δ���ӵ�list�У�������Ԫ��
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
