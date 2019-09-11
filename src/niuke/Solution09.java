package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 11:08
 */
public class Solution09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left++, right--);
        }
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(" ");
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
