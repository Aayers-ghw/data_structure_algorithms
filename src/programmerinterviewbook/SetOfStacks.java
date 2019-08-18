package programmerinterviewbook;

import algo.array.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 14:31
 */
public class SetOfStacks {

    /**
     * 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，当前一个栈填满时，新建一个栈。
     * 该数据结构应支持与普通栈相同的push和pop操作。
     * <p>
     * 给定一个操作序列int[][2] ope(C++为vector&ltvector&ltint>>)，每个操作的第一个数代表操作类型，
     * 若为1，则为push操作，后一个数为应push的数字；若为2，则为pop操作，后一个数无意义。
     * 请返回一个int[][](C++为vector&ltvector&ltint>>)，为完成所有操作后的SetOfStacks，
     * 顺序应为从下到上，默认初始的SetOfStacks为空。保证数据合法。
     *
     * @param ope
     * @param size
     * @return
     */
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (ope == null || ope.length == 0) {
            return (ArrayList) res;
        }
        for (int i = 0; i < ope.length; ++i) {
            if (ope[i][0] == 1) {
                if (list.size() == size) {
                    res.add(list);
                    list = new ArrayList<>();
                }
                list.add(ope[i][1]);
            } else if (ope[i][0] == 2) {
                if (list.size() <= 0) {
                    list = res.get(res.size() - 1);
                    res.remove(res.size() - 1);
                }
                list.remove(list.size() - 1);
            }
        }
        if (list.size() != 0) {
            res.add(list);
        }
        return (ArrayList) res;
    }
}
