package interviewtop;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/11 21:38
 */
public class Candy {

    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        int[] nums=  new int[ratings.length];
        Arrays.fill(nums, 1);
        for (int i = 1; i < ratings.length ; ++i) {
            if (nums[i - 1] < nums[i]) {
                nums[i] = nums[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; --i) {
            if (nums[i] > nums[i + 1]) {
                nums[i] = Math.max(nums[i - 1], nums[i] + 1);
            }
        }
        int res = 0;
        for (int num : nums) {
            res += num;
        }
        return res;
    }
}
