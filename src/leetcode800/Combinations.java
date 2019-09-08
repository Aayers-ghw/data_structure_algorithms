package leetcode800;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/9/8 16:10
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        help(res, new ArrayList<>(), n, 1, k);
        return res;
    }

    private void help(List<List<Integer>> res, List<Integer> list, int n, int start, int k) {
        if (k == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; ++i) {
            list.add(i);
            help(res, list, n, i + 1, k - 1);
            list.remove(list.size() - 1);
        }
    }
}
