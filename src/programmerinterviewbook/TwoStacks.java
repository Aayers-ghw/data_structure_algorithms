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
     * 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，
     * 但不得将元素复制到别的数据结构中。
     * <p>
     * 给定一个int[] numbers(C++中为vector&ltint>)，其中第一个元素为栈顶，请返回排序后的栈。
     * 请注意这是一个栈，意味着排序过程中你只能访问到最后一个元素。
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
        //构建辅助栈,用来存放排好序的数
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
