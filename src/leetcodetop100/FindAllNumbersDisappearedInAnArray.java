package leetcodetop100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 18:56
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int n = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            nums[(nums[i] - 1) % n] += n;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= n) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
