package programmerinterviewbook;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 20:28
 */
public class NextElementII {

    /**
     * 现在有一个数组，请找出数组中每个元素的后面比它大的最小的元素，若不存在则为-1。
     * <p>
     * 给定一个int数组A及数组的大小n，请返回每个元素所求的值组成的数组。
     * 保证A中元素为正整数，且n小于等于1000。
     *
     * @param A
     * @param n
     * @return
     */
    public int[] findNext(int[] A, int n) {
        if (A == null || n == 0) {
            return new int[]{};
        }
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            while (!stack1.isEmpty() && stack1.peek() <= A[i]) {
                stack2.push(stack1.pop());
            }
            res[i] = stack1.isEmpty() ? -1 : stack1.peek();
            stack1.push(A[i]);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        return res;
    }
}
