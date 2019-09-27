package interview.wanmeishijie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/9/27 19:54
 */
public class Solution03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int len = str.length;
        int[][] weight = new int[len][len];
        for (int i = 0; i < len; ++i) {
            int tmp = Integer.parseInt(str[i]);
            if (tmp == -1) {
                weight[0][i] = Integer.MAX_VALUE;
            } else {
                weight[0][i] = tmp;
            }
        }
        for (int i = 1; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                int tmp = scanner.nextInt();
                if (tmp == -1) {
                    weight[i][j] = Integer.MAX_VALUE;
                } else {
                    weight[i][j] = tmp;
                }
            }
        }
        int[] dijsktra = dijsktra(weight, 0);
        for (int i = 1; i < dijsktra.length; ++i) {
            System.out.println(dijsktra[i]);
        }
    }

    private static int[] dijsktra(int[][] weight, int start) {
        int length = weight.length;
        int[] result = new int[length];
        result[0] = 0;
        int[] visited = new int[length];
        Arrays.fill(visited, 0);
        visited[0] = 1;
        for (int i = 1; i < length; ++i) {
            int k = -1;
            int dmin = Integer.MAX_VALUE;
            for (int j = 0; j < length; ++j) {
                if (visited[j] == 0 && weight[start][j] < dmin) {
                    dmin = weight[start][j];
                    k = j;
                }
            }
            result[k] = dmin;
            visited[k] = 1;
            for (int j = 0; j < length; ++j) {
                if (visited[j] == 0 && weight[k][j] != Integer.MAX_VALUE
                        && weight[start][k] + weight[k][j] < weight[start][j]) {
                    weight[start][j] = weight[start][k] + weight[k][j];
                }
            }
        }
        return result;
    }
}
