package interview.tujia;

import java.util.Scanner;

/**
 * 法师住在喜马拉雅上脚下的一个村庄，突然一天，发生大雪崩，很快村庄就要被掩埋，所有人将会遇难。
 * <p>
 * 法师的跑步的速度为13m/s,以这样的速度，是无法逃离雪崩的。但是，法师有闪跳技能，可在1s内移动50m,每次使用技能后，会消耗10点魔法值。
 * 魔法值的恢复速度为4点/s,只有在原地休息状态时才能够恢复。
 * <p>
 * 现已知法师初始值为M,所在位置与安全区域的距离为S,雪崩到达村庄的时间为T。
 * <p>
 * 编写一个程序，计算法师如何在最短的时间内到达安全区域，如不能够逃脱，输出法师在时间内走的最远距离。
 *
 * @author Aayers-ghw
 * @date 2019/9/6 21:16
 */
public class Solution01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.next());
        int s = Integer.parseInt(scanner.next());
        int t = Integer.parseInt(scanner.next());
        int dis = 0;
        for (int i = 1; i <= t; ++i) {
            if (m >= 10) {
                dis += 50;
                m -= 10;
            }
            //3.5s可以加到10魔法值
            else if (t - i > 4) {
                m += 4;
            } else {
                dis += 13;
            }

            if (dis >= s) {
                System.out.println("Yes");
                System.out.println(i);
                return;
            }
        }
        System.out.println("No");
        System.out.println(dis);
    }
}
