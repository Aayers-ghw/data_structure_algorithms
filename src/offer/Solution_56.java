package offer;

/**
 * 数组中唯一只出现一次的数字
 *
 * @author Aayers-ghw
 * @date 2019/7/24 16:45
 */
public class Solution_56 {
    /**
     * 找出数组中只出现一次的数字，其它数字都出现三次
     *
     * @param nums 数字
     * @return 只出现一次的数字
     */
    public static int findNumberAppearingOnce(int[] nums) throws Exception {
        if (nums == null || nums.length == 0) {
            throw new Exception("Invalid input.");
        }
        int res = 0;
        int[] bitSum = new int[32];
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            for (int j = 31; j >= 0; --j) {
                if ((num & 1) == 1) {
                    bitSum[j]++;
                }
                num = num >> 1;
            }
        }
        for (int i = 0; i < bitSum.length; ++i) {
            res = res << 1;
            res += bitSum[i] % 3;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        int numberAppearingOnce = findNumberAppearingOnce(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4});
        System.out.println(numberAppearingOnce);
    }
}
