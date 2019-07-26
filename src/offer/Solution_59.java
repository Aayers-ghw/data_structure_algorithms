package offer;

import javax.crypto.spec.DESedeKeySpec;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * �������ڵ����ֵ
 * ��һ��˫�˶��У����е�һ��λ�ñ��浱ǰ���ڵ����ֵ�������ڻ���һ��
 * 1.�жϵ�ǰ���ֵ�Ƿ����
 * 2.�����ӵ�ֵ�Ӷ�β��ʼ�Ƚϣ������б���С��ֵ����
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
