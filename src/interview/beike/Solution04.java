package interview.beike;

import java.util.Scanner;

/**
 * 题目描述：
 * 小C在做一种特殊的服务器负载测试，对于一个请求队列中的请求，
 * 每一个请求都有一个负荷值，为了保证服务器稳定，请求队列中的
 * 请求负荷必须按照先递增后递减的规律(仅递增，仅递减也可以)，
 * 比如[ 1，2，8，4，3 ]，[ 1，3，5 ]和[ 10 ]这些是满足规律的，
 * 还有一些不满足的，比如[ 1，2，2，1 ]，[ 2，1，2 ]和[ 10，10 ]。
 * 现在给你一个请求队列，你可以对请求的负荷值进行增加，要求你调整队列中请求的负荷值，
 * 使数组满足条件。最后输出使队列满足条件最小的增加总和。
 * @author Aayers-ghw
 * @date 2019/8/10 19:49
 */
public class Solution04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) {
                scanner.nextInt();
            }
            int res = 0;
            for (int i = 0; i < nums.length; ++i) {
                int count = 0;

                boolean flag = true;
                int leftTemp = nums[i];
                for (int left = i - 1; left >= 0; --left) {
                    if (nums[left] < leftTemp) {
                        leftTemp = nums[left];
                    } else if (nums[left] > leftTemp) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    continue;
                }

                if (i + 1 < nums.length) {
                    int rightTemp = nums[i + 1];
                    for (int right = i + 2; right < nums.length; ++right) {
                        if (rightTemp < nums[right]) {
                            rightTemp = nums[right];
                        } else if (rightTemp > nums[right]) {
                            count += (rightTemp - nums[right]);
                        }
                    }
                }

            }
        }
    }
}
