package leetcode800;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/9/7 20:45
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "0";
        }
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (a, b) -> ((b + a).compareTo(a + b)));
        StringBuilder sb = new StringBuilder();
        if (str[0].charAt(0) == '0') {
            return "0";
        }
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}
