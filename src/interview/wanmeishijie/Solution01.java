package interview.wanmeishijie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 17:48
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int limit = scanner.nextInt();
        int[] nums = new int[s.length];
        for (int i = 0; i < s.length; ++i) {
            nums[i] = Integer.parseInt(s[i]);
        }
        boolean[] flag = new boolean[nums.length];
        int res = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == limit) {
                res++;
                flag[left] = true;
                flag[right] = true;
                left++;
            } else if (nums[left] + nums[right] > limit){
                right--;
            } else {
                left++;
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            if (!flag[i]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
