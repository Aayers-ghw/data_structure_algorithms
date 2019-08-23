package programmerinterviewbook;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 9:51
 */
public class StackII {

    /**
     * 叠罗汉是一个著名的游戏，游戏中一个人要站在另一个人的肩膀上。
     * 为了使叠成的罗汉更稳固，我们应该让上面的人比下面的人更轻一点。
     * 现在一个马戏团要表演这个节目，为了视觉效果，我们还要求下面的人的身高比上面的人高。
     * 请编写一个算法，计算最多能叠多少人，注意这里所有演员都同时出现。
     * <p>
     * 给定一个二维int的数组actors，每个元素有两个值，分别代表一个演员的身高和体重。
     * 同时给定演员总数n，请返回最多能叠的人数。保证总人数小于等于500。
     *
     * @param actors
     * @param n
     * @return
     */
    public int getHeight(int[][] actors, int n) {
        // write code here
        if (actors == null || actors.length == 0) {
            return -1;
        }
        Arrays.sort(actors, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; ++i) {
            dp[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (actors[i][1] > actors[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
