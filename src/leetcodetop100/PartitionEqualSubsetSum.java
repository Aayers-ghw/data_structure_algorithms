package leetcodetop100;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/6 14:01
 */
public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        sum /= 2;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            count += nums[i];
            if (count == sum) {
                return true;
            } else {
                if (count > sum) {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = new PartitionEqualSubsetSum().canPartition(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println(b);
    }
}
