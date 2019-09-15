package interview.zhaoshangyinhang;

import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 22:04
 */
public class Solution02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] graph = new int[n + 1][n + 1];
        for (int i = 0; i < n - 1; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph[u][v] = w;
        }
    }
}
