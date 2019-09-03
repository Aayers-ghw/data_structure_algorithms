package interview.chuanglinkeji;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/3 19:13
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int[] nums = new int[s.length];
        for (int i = 0; i < s.length; ++i) {
            nums[i] = Integer.parseInt(s[i].trim());
        }
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (total >= nums[i]) {
                res += nums[i];
                total -= nums[i];
            }
        }
        System.out.println(res);
    }
}
