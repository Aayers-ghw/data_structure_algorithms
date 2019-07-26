package offer;

import javax.crypto.spec.DESedeKeySpec;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 滑动窗口的最大值
 * 用一个双端队列，队列第一个位置保存当前窗口的最大值，当窗口滑动一次
 * 1.判断当前最大值是否过期
 * 2.新增加的值从队尾开始比较，把所有比他小的值丢掉
 *
 * @author Aayers-ghw
 * @date 2019/7/25 16:47
 */
public class Solution_59 {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size < 1) {
            return res;
        }
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < num.length; ++i) {
            int begin = i - size + 1;
            if (deque.isEmpty()) {
                deque.add(i);
            } else if (begin > deque.getFirst()) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && num[i] >= num[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.add(i);
            if (begin >= 0) {
                res.add(num[deque.getFirst()]);
            }
        }
        return res;
    }
}
