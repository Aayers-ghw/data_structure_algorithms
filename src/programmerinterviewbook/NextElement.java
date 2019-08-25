package programmerinterviewbook;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 16:26
 */
public class NextElement {

    /**
     * 现在我们有一个int数组，请你找出数组中每个元素的下一个比它大的元素。
     * <p>
     * 给定一个int数组A及数组的大小n，请返回一个int数组，代表每个元素比他大的下一个元素,若不存在则为-1。
     * 保证数组中元素均为正整数。
     *
     * @param A
     * @param n
     * @return
     */
    public int[] findNext(int[] A, int n) {
        if (A == null || A.length == 0) {
            return new int[]{};
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                A[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            A[stack.pop()] = -1;
        }
        return A;
    }
}
