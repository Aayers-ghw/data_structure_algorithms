package leetcodetop100;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/7/29 9:34
 */
public class ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] tmp = nums.clone();
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < n && nums[start] == tmp[start]) {
            start++;
        }

        while(end >= start && nums[end] == tmp[end]) {
            end--;
        }
        return end - start + 1;
    }
}
