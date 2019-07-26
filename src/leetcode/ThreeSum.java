package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 *
 * @author Aayers-ghw
 * @date 2019/7/26 9:33
 */
public class ThreeSum {
    /**
     * Ϊ�˱���õ��ظ������
     * ���ǲ���Ҫ�����ظ�Ԫ�أ�����Ҫ��֤2Sum�ҵķ�ΧҪ������������ѡ�����Ǹ���֮��ġ�
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if (nums == null || nums.length < 2) {
            return res;
        }
        for (int i = 0; i < nums.length - 2; ++i) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    if (nums[l] + nums[r] + nums[i] == 0) {
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    } else if (nums[i] + nums[l] + nums[r] > 0) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
