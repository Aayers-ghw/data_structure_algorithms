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
     * ��ʵ��һ�����ݽṹSetOfStacks���ɶ��ջ��ɣ�����ÿ��ջ�Ĵ�СΪsize����ǰһ��ջ����ʱ���½�һ��ջ��
     * �����ݽṹӦ֧������ͨջ��ͬ��push��pop������
     * <p>
     * ����һ����������int[][2] ope(C++Ϊvector&ltvector&ltint>>)��ÿ�������ĵ�һ��������������ͣ�
     * ��Ϊ1����Ϊpush��������һ����ΪӦpush�����֣���Ϊ2����Ϊpop��������һ���������塣
     * �뷵��һ��int[][](C++Ϊvector&ltvector&ltint>>)��Ϊ������в������SetOfStacks��
     * ˳��ӦΪ���µ��ϣ�Ĭ�ϳ�ʼ��SetOfStacksΪ�ա���֤���ݺϷ���
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
