package interviewtop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 16:01
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows < 1) {
            return res;
        }
        List<Integer>   temp = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            temp.add(0, 1);
            for (int j = 1; j < temp.size() - 1; ++j) {
                temp.set(j, temp.get(j) + temp.get(j + 1));
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }
}
