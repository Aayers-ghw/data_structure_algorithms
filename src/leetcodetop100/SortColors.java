package leetcodetop100;

/**
 * @author Aayers-ghw
 * @date 2019/7/28 13:01
 */
public class SortColors {

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        int n = nums.length - 1;
        for (int i = 0; i <= n; ++i) {
            if (nums[i] == 0) {
                swap(nums, j, i);
                j++;
            } else if (nums[i] == 2) {
                swap(nums, i, n);
                n--;
                i--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
