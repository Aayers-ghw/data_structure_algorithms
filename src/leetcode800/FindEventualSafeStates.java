package leetcode800;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/26 13:34
 */
public class FindEventualSafeStates {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        if (graph == null || graph.length == 0) {
            return res;
        }
        int nodeCount = graph.length;
        int[] color = new int[nodeCount];
        for (int i = 0; i < nodeCount; ++i) {
            if (dfs(graph, i, color)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean dfs(int[][] graph, int start, int[] color) {
        if (color[start] != 0) {
            return color[start] == 1;
        }
        color[start] = 2;
        for (int i = 0; i < graph[start].length; ++i) {
            if (!dfs(graph, graph[start][i], color)) {
                return false;
            }
        }
        color[start] = 1;
        return true;
    }
}
