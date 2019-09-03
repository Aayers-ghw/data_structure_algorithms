package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/9/2 20:59
 */
public class IsGraphBipartite {

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];

        for (int i = 0; i < n; ++i) {
            if (colors[i] == 0 && !validColor(graph, colors, 1, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean validColor(int[][] graph, int[] colors, int color, int node) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (int next: graph[node]) {
            if (!validColor(graph, colors, -1 * color, next)) {
                return false;
            }
        }
        return true;
    }
}
