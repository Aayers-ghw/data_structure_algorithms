package programmerinterviewbook;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 20:28
 */
public class NextElementII {

    /**
     * ������һ�����飬���ҳ�������ÿ��Ԫ�صĺ�����������С��Ԫ�أ�����������Ϊ-1��
     * <p>
     * ����һ��int����A������Ĵ�Сn���뷵��ÿ��Ԫ�������ֵ��ɵ����顣
     * ��֤A��Ԫ��Ϊ����������nС�ڵ���1000��
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
