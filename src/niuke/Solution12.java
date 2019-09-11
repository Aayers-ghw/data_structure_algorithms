package niuke;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/10 16:27
 */
public class Solution12 {

    /**
     * 圈地运动，就是用很多木棍摆在地上组成一个面积大于0的多边形～
     * <p>
     * 小明喜欢圈地运动，于是他需要去小红店里面买一些木棍，期望圈出一块地来。
     * 小红想挑战一下小明，所以给小明设置了一些障碍。障碍分别是：
     * 1.如果小明要买第i块木棍的话，他就必须把前i-1块木棍都买下来。
     * 2.买了的木棍都必须用在圈地运动中。
     * 那么请问小明最少买多少根木棍，才能使得木棍围成的图形是个面积大于0多边形呢？
     */
    public static void main(String[] args) {
        /**
         * 题意：输入一组数据，判断前i个数据是否能够构成多边形
         * 如果输入的数组长度小于2肯定是不能够构成多边形的
         * 在i>=3的条件下，如果数组前i个数的和sum减去前i个数的最大值max剩余的总和大于sum,即，sum-max>max;
         * 则可以构成多边形，否者不可以。
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println(-1);
            return;
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 2; i < n; ++i) {
            int max = 0;
            int sum = 0;
            for (int j = 0; j <= i; ++j) {
                if (max < nums[j]) {
                    sum += max;
                    max = nums[j];
                } else {
                    sum += nums[j];
                }
            }
            if (max < sum) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
