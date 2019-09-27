package interview.tongcheng.zhuanzhuan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/21 18:39
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[200];
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[197]);
    }
}
