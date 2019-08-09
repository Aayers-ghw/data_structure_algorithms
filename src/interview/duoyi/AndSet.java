package interview.duoyi;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/9 16:13
 */
public class AndSet {

    public static void main(String[] args) {
        //保存节点的直接父节点
        int[]  pre = new int[1050];
        int n;
        int m;
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            //初始化pre数组
            for (int i = 1; i <= n; ++i) {
                pre[i] = i;
            }
            //根据连通情况，构建pre数组
            for (int i = 1; i <= m; ++i) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                join(pre, a, b);
            }
            for (int i = 1; i <= n; ++i) {
                if (pre[i] == i) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    private static void join(int[] pre, int x, int y) {
        int fx = find(pre, x);
        int fy = find(pre, y);
        if (fx != fy) {
            pre[fy] = pre[fx];
        }
    }

    /**
     * 查找x的根节点
     * @param a
     * @return
     */
    private static int find(int[] pre, int a) {
        if (pre[a] != a) {
            //路径压缩，本结点更新为根结点的子结点
            find(pre, pre[a]);
        }
        return pre[a];
    }
}
