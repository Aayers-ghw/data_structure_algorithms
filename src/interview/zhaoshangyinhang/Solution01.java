package interview.zhaoshangyinhang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 21:52
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int cnt = (int) Math.pow(10, 100);
        int[] nums = new int[str.length()];
        for (int i = 0; i < str.length(); ++i) {
            int index = i;
            for (int j = 0; j < cnt; ++j) {
                if (str.charAt(index) == 'R') {
                    index++;
                } else if (str.charAt(index) == 'L') {
                    index--;
                }
            }
            nums[index]++;
        }
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
