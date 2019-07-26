package offer;

/**
 * ������Ψһֻ����һ�ε�����
 *
 * @author Aayers-ghw
 * @date 2019/7/24 16:45
 */
public class Solution_56 {
    /**
     * �ҳ�������ֻ����һ�ε����֣��������ֶ���������
     *
     * @param nums ����
     * @return ֻ����һ�ε�����
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
