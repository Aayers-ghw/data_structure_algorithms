package leetcode800;

import javafx.util.Pair;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/4 13:37
 */
public class MostProfitAssigningWork {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<Pair<Integer, Integer>> jobs = new ArrayList<>();
        int n = profit.length;
        int res = 0;
        int i = 0;
        int best = 0;
        for (int j = 0; j < n; ++i) {
            jobs.add(new Pair<>(difficulty[j], profit[j]));
        }
        Collections.sort(jobs, Comparator.comparing(Pair::getKey));
        Arrays.sort(worker);
        for (int ability : worker) {
            while (i < n && ability >= jobs.get(i).getKey()) {
                best = Math.max(best, jobs.get(i++).getValue());
            }
            res += best;
        }
        return res;
    }
}
