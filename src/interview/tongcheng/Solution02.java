package interview.tongcheng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/12 19:47
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] tmp = new int[n];
        Arrays.fill(tmp, 1);
        for (int i = 1; i < n; ++i) {
            if (nums[i] > nums[i - 1]) {
                tmp[i] = tmp[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; --i) {
            while (nums[i] > nums[i + 1] && tmp[i] <= tmp[i + 1]) {
                tmp[i]++;
            }
        }
        int res = 0;
        for (int i : tmp) {
            res += i;
        }
        System.out.println(res);
    }
}
