package leetcode800;

/**
 * @author Aayers-ghw
 * @date 2019/9/8 14:03
 */
public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j < i; ++j) {
                G[i] += G[j] * G[i - j - 1];
            }
        }
        return G[n];
    }
}
