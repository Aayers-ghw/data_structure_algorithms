package interview.beike;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/10 18:57
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] nums = new String[n];
            for (int i = 0; i < n; ++i) {
                nums[i] = scanner.next();
            }
            long minFirst = 0;
            long minSecond = 0;
            long min = Long.MAX_VALUE;
            for (int i = 1; i < nums.length; ++i) {
                long temp = Long.parseLong(nums[i]) - Long.parseLong(nums[i - 1]);
                if (Math.abs(temp) < min) {
                    min = Math.abs(temp);
                    minFirst = Long.parseLong(nums[i - 1]);
                    minSecond = Long.parseLong(nums[i]);
                }
            }
            System.out.println(minFirst + " " + minSecond);
        }
    }
}
