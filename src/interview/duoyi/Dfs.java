package interview.duoyi;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/9 16:27
 */
public class Dfs {

    static int[][] dir = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

    public static void main(String[] args) {
        //保存节点的直接父节点
        int[][] grap;
        boolean[][] vis;
        int n;
        int m;
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            grap = new int[n][];
            vis = new boolean[n][];
            for (int i = 0; i < m; ++i) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                grap[x][y] = 1;
            }
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    if (grap[i][j] != 1 && !vis[i][j]) {
                        vis[i][j] = true;
                        ans++;
                        dfs(grap, vis, i, j);
                    }
                }
            }
            System.out.println(ans);
        }
    }

    public static void dfs(int[][] grap, boolean[][] vis, int i, int j) {
        for (int k = 0; k < 4; ++k) {
            int tx = dir[i][0];
            int ty = dir[i][1];
            if (tx < 0 || tx > grap.length || ty < 0 || ty > grap[0].length) {
                continue;
            }
            if (!vis[i][j] && grap[i][j] != 0) {
                vis[i][j] = false;
                dfs(grap, vis, tx, ty);
            }
        }
    }
}
