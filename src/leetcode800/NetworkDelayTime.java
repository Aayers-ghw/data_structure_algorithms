package leetcode800;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/9/2 9:14
 */
public class NetworkDelayTime {

    public int networkDelayTime_FW(int[][] times, int N, int K) {
        double[][] disTo = new double[N][N];
        for (int i = 0; i < N; ++i) {
            Arrays.fill(disTo[i], Double.POSITIVE_INFINITY);
        }
        for (int i = 0; i < N; ++i) {
            disTo[i][i] = 0;
        }
        for (int[] edge : times) {
            disTo[edge[0] - 1][edge[1] - 1] = edge[2];
        }
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                for (int k = 0; k < N; ++k) {
                    if (disTo[j][k] > disTo[j][i] + disTo[i][k]) {
                        disTo[j][k] = disTo[j][i] + disTo[i][k];
                    }
                }
            }
        }
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < N; ++i) {
            if (disTo[K - 1][i] == Double.POSITIVE_INFINITY) {
                return -1;
            }
            max = Math.max(max, disTo[K - 1][i]);
        }
        return (int)max;
    }
}
