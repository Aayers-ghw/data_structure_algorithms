package programmerinterviewbook;

import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 16:26
 */
public class NextElement {

    /**
     * ����������һ��int���飬�����ҳ�������ÿ��Ԫ�ص���һ���������Ԫ�ء�
     * <p>
     * ����һ��int����A������Ĵ�Сn���뷵��һ��int���飬����ÿ��Ԫ�ر��������һ��Ԫ��,����������Ϊ-1��
     * ��֤������Ԫ�ؾ�Ϊ��������
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
