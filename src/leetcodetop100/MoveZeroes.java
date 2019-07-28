package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/7/22 19:39
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0;
        int j = 0;
        while (i < nums.length && j < nums.length) {

            while (j < nums.length && nums[j] == 0) {
                j++;
            }
            if (j == nums.length) {
                return;
            }
            while (nums[i] != 0) {
                i++;
            }
            swap(nums, i, j);
            i++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
