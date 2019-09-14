package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/14 14:26
 */
public class Solution15 {
    /**
     * 有K种颜色的小球(K<=10)，每种小球有若干个，总数小于100个。
     * 现在有一个小盒子，能放N个小球(N<=8)，现在要从这些小球里挑出N个小球，放满盒子。
     * 想知道有哪些挑选方式。注：每种颜色的小球之间没有差别。
     * <p>
     * 请按数字递增顺序输出挑选小球的所有方式。
     * <p>
     * 如有3种颜色，每种颜色小球的个数分别为a:1,b:2,c:3，挑出3个小球的挑法有：
     * 003,012,021,102,111,120
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums = new int[k];
        for (int i = 0; i < k; ++i) {
            nums[i] = scanner.nextInt();
        }
        List<String> res = new ArrayList<>();
        help(res, n, 0, nums, "");
        res.forEach(System.out::println);
    }

    private static void help(List<String> res, int n, int start, int[] nums, String s) {
        if (n == 0 && start == nums.length) {
            res.add(s);
            return;
        }
        if (start == nums.length) {
            return;
        }
        for (int i = 0; i <= Math.min(n, nums[start]); ++i) {
            help(res, n - i, start + 1, nums, s + i);
        }
    }
}
