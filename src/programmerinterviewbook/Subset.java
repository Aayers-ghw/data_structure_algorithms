package programmerinterviewbook;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 10:35
 */
public class Subset {

    /**
     * ���дһ������������ĳ���ϵ����зǿ��Ӽ���
     * <p>
     * ����һ��int����A������Ĵ�Сint n���뷵��A�����зǿ��Ӽ�����֤A��Ԫ�ظ���С�ڵ���20����Ԫ�ػ��졣
     * ���Ӽ��ڲ��Ӵ�С����,�Ӽ�֮���ֵ��������򣬼�������
     *
     * @param A
     * @param n
     * @return
     */
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (A == null || A.length == 0) {
            return res;
        }
        Arrays.sort(A);
        reserve(A, 0, n-1);
        dfs(A, res, new ArrayList<>(), 0);
        return res;
    }

    public void dfs(int[] A, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int start) {
        for (int i = start; i < A.length; ++i) {
            list.add(A[i]);
            dfs(A, res, list, i + 1);
            list.remove(list.size() - 1);
        }
        if (list.size() != 0) {
            ArrayList<Integer> tmp = new ArrayList<>(list);
            Collections.sort(tmp, (o1, o2) -> (o2 - o1));
            res.add(tmp);
        }
    }

    private void reserve(int[] array,int begin,int end){
        while(begin<end){
            int tmp=array[begin];
            array[begin]=array[end];
            array[end]=tmp;
            begin++;
            end--;
        }
    }
}
