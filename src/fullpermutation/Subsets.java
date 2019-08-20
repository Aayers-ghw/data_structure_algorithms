package fullpermutation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 15:05
 */
public class Subsets {

    /**
     * ����ԭ����ÿһ������ֻ������״̬��Ҫô���ڣ�Ҫô�����ڣ���ô�ڹ����Ӽ�ʱ����ѡ��Ͳ�ѡ�����������
     * ���Կ��Թ���һ�ö���������������ʾѡ��ò㴦��Ľڵ㣬��������ʾ��ѡ�����յ�Ҷ�ڵ���������Ӽ���
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> list, int[] nums, int start) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; ++i) {
            list.add(nums[i]);
            backtrack(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
