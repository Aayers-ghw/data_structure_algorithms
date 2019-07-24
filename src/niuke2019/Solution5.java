package niuke2019;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/7/24 20:54
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        scanner.nextLine();
        if (n % 2 == 0) {
            for (int i = n - 1; i > 0; i = i - 2) {
                System.out.print(nums[i] + " ");
            }
            System.out.print(nums[0]);
            for (int i = 2; i <nums.length - 1; i = i + 2) {
                System.out.print(" " + nums[i]);
            }
        } else {
            for (int i = n - 1; i > 0; i = i - 2) {
                System.out.print(nums[i] + " ");
            }
            System.out.print(nums[0]);
            for (int i = 1; i < nums.length - 1; i = i + 2) {
                System.out.print(" " + nums[i]);
            }
        }
    }
}
