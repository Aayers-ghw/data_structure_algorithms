package interview.dajiang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 18:44
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //bug数
            int n = scanner.nextInt();
            //加速倍率
            int a = scanner.nextInt();
            //和咖啡总数
            int x = scanner.nextInt();
            int[] nums = new int[n];
            int total = 0;
            for (int i = 0; i < n; ++i) {
                nums[i] = scanner.nextInt();
                total += nums[i];
            }
            int caffeTimes = 60 * a * x;
            int res;
            if (caffeTimes > total) {
                res = total / a;
                if (a * res < total * 1) {
                    res++;
                }
                if (res > 8 * 60) {
                    System.out.println("0");
                } else {
                    System.out.println(res);
                }
            } else {
                int temp = total - caffeTimes;
                res = temp + caffeTimes * 1 / a;
                if ((res - temp) * a < caffeTimes * 1) {
                    res++;
                }
                if (res > 8 * 60) {
                    System.out.println("0");
                } else {
                    System.out.println(res);
                }
            }
        }
    }
}
