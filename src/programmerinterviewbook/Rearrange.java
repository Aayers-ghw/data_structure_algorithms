package programmerinterviewbook;

import java.util.Arrays;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 10:54
 */
public class Rearrange {

    /**
     * 有一个整数数组，请编写一个函数，找出索引m和n，只要将m和n之间的元素排好序，整个数组就是有序的。
     * 注意：n-m应该越小越好，也就是说，找出符合条件的最短序列。
     * <p>
     * 给定一个int数组A和数组的大小n，请返回一个二元组，代表所求序列的起点和终点。
     * (原序列位置从0开始标号,若原序列有序，返回[0,0])。保证A中元素均为正整数。
     *
     * @param A
     * @param n
     * @return
     */
    public int[] findSegment(int[] A, int n) {
        // write code here
        int[] res = new int[2];
        if (A == null || A.length == 0) {
            return res;
        }
        int[] tmp = new int[n];
        for (int i = 0; i < n; ++i) {
            tmp[i] = A[i];
        }
        Arrays.sort(tmp);
        int start = 0;
        int end = n - 1;
        while (start < n && tmp[start] == A[start]) {
            start++;
        }
        if (start == n) {
            return res;
        }
        while (end >= 0 && tmp[end] == A[end]) {
            end--;
        }
        if (end < 0) {
            return res;
        }
        res[0] = start;
        res[1] = end;
        return res;
    }
}
