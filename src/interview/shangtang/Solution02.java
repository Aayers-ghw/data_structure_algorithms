package interview.shangtang;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 21:39
 */
public class Solution02 {

    /**
     * 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：
     * <p>
     * B.length >= 3
     * 存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
     * （注意：B 可以是 A 的任意子数组，包括整个数组 A。）
     * <p>
     * 给出一个整数数组 A，返回最长 “山脉” 的长度。
     * <p>
     * 如果不含有 “山脉” 则返回 0。
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestMountain(arr));
        sc.close();
    }

    public static int longestMountain(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        int[] increase = new int[A.length];
        int[] decrease = new int[A.length];
        Arrays.fill(increase, 1);
        Arrays.fill(decrease, 1);
        for (int i = 1; i < A.length; ++i) {
            if (A[i] > A[i - 1]) {
                increase[i] = increase[i - 1] + 1;
            }
        }
        for (int i = A.length - 2; i >= 0; ++i) {
            if (A[i] > A[i + 1]) {
                decrease[i] = decrease[i + 1] + 1;
            }
        }
        int res = 0;
        for (int i = 1; i < A.length - 1; ++i) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                res = Math.max(res, increase[i - 1] + decrease[i + 1] + 1);
            }
        }
        return res;
    }
}
