package programmerinterviewbook;

import algo.array.Array;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 14:48
 */
public class TwoStacks {

    /**
     * ���дһ�����򣬰������ջ�������򣨼����Ԫ��λ��ջ������Ҫ�����ֻ��ʹ��һ�������ջ�����ʱ���ݣ�
     * �����ý�Ԫ�ظ��Ƶ�������ݽṹ�С�
     * <p>
     * ����һ��int[] numbers(C++��Ϊvector&ltint>)�����е�һ��Ԫ��Ϊջ�����뷵��������ջ��
     * ��ע������һ��ջ����ζ�������������ֻ�ܷ��ʵ����һ��Ԫ�ء�
     *
     * @param numbers
     * @return
     */
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        ArrayList<Integer> res = new ArrayList<>();
        if (numbers == null || numbers.length == 0) {
            return res;
        }
        Stack<Integer> initStack = new Stack<>();
        for (int num : numbers) {
            initStack.push(num);
        }
        //��������ջ,��������ź������
        Stack<Integer> tmpStack = new Stack<>();
        while (!initStack.isEmpty()) {
            if (tmpStack.isEmpty()) {
                tmpStack.push(initStack.pop());
            } else {
                int tmp = initStack.pop();
                while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                    initStack.push(tmpStack.pop());
                }
                tmpStack.push(tmp);
            }
        }
        while (!tmpStack.isEmpty()) {
            res.add(tmpStack.pop());
        }
        return res;
    }
}
