package programmerinterviewbook;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/20 10:35
 */
public class Subset {

    /**
     * 请编写一个方法，返回某集合的所有非空子集。
     * <p>
     * 给定一个int数组A和数组的大小int n，请返回A的所有非空子集。保证A的元素个数小于等于20，且元素互异。
     * 各子集内部从大到小排序,子集之间字典逆序排序，见样例。
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
