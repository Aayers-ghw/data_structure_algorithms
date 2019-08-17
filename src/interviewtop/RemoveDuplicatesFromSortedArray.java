package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 8:39
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i < nums.length && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[res++] = nums[i];
            }
        }
        return res;
    }
}
