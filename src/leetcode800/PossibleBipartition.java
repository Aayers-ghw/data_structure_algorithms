package leetcode800;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Aayers-ghw
 * @date 2019/9/3 10:03
 */
public class PossibleBipartition {

    public boolean possibleBipartition(int N, int[][] dislikes) {

        int[][] graph = new int[N][N];
        for (int[] d : dislikes) {
            graph[d[0] - 1][d[1] - 1] = 1;
            graph[d[1] - 1][d[0] - 1] = 1;
        }
        int[] colors = new int[N];
        for (int i = 0; i < N; i++) {
            if (colors[i] == 0 && !dfs(graph, colors, i, 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int[][] graph, int[] colors, int cur, int color) {
        colors[cur] = color;
        for (int i = 0; i < graph.length; ++i) {
            if (graph[cur][i] == 1) {
                if (colors[i] == color) {
                    return false;
                }
                if (colors[i] == 0 && !dfs(graph, colors, i, -color)) {
                    return false;
                }
            }
        }
        return true;
    }
}
