package niuke;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 10:47
 */
public class Solution13 {

    /**
     * 小明有一个花园，花园里面一共有m朵花，对于每一朵花，都是不一样的，小明用1～m中的一个整数表示每一朵花。
     *
     * 他很喜欢去看这些花，有一天他看了n次，并将n次他看花的种类是什么按照时间顺序记录下来。
     *
     * 记录用a[i]表示，表示第i次他看了a[i]这朵花。
     *
     * 小红很好奇，她有Q个问题,问[l,r]的时间内，小明一共看了多少朵不同的花儿，小明因为在忙着欣赏他的花儿，所以想请你帮他回答这些问题。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            int input = scanner.nextInt();
            nums[i] = input;
        }
        int q = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        while (--q >= 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            for (int i = l; i <= r; ++i) {
                set.add(nums[i - 1]);
            }
            System.out.println(set.size());
            set.clear();
        }
    }
}
