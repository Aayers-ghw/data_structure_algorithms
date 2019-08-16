//package interview.t360;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * @author Aayers-ghw
// * @date 2019/8/15 18:59
// */
//public class Solution02 {
//
//
//    static int res = 0;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] nums = new int[n][m];
//        int[][][] vis = new int[n][m][6];
//        Arrays.fill(vis, 0);
//        for (int i = 0; i < n; ++i) {
//            for (int j = 0;j < m; ++j) {
//                nums[i][j] = scanner.nextInt();
//                res = 6 * nums[i][j];
//            }
//        }
//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < m; ++j) {
//                for (int k = 0; k < 6; ++k) {
//                    dfs(nums, vis, i, j, k);
//                }
//            }
//        }
//    }
//
//    public static int dfs(int[][] nums, int[][][] vis, int i, int j, int k) {
//        if (i < 0 || i >= nums.length || j < 0 || j >= nums[0].length || vis[i][j][k] == 1) {
//            return 0;
//        }
//        vis[i][j][k] = 1;
//        if ()
//    }
//}
